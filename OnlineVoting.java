
import java.util.Scanner;

public class OnlineVoting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        long AadharNo;
        int accNo;
        do
        {
            RegisterOrLogin reg=new RegisterOrLogin();
            String yN=reg.regLogin();
            if(yN.equals("no"))
            {
                Account account=new Account();
            }
            else
            {
                System.out.println("Enter your name:");
                name=sc.nextLine();
                System.out.println("Enter your AadharNo:");
                AadharNo=sc.nextLong();
                Account account=new Account(name,AadharNo);
            }
            accNo=sc.nextInt();
            sc.nextLine();
        }while (accNo!=0);
        ElectionResult result=new ElectionResult();
        result.declareResult();
    }
}
class RegisterOrLogin
{
    public String regLogin()
    {
        System.out.println("Do you have an online voting Account");
        System.out.println("'Yes' or 'No'");
        Scanner sc=new Scanner(System.in);
        String yesOrNo=sc.nextLine();
        yesOrNo=yesOrNo.toLowerCase();
        return yesOrNo;
    }
}

class Address
{
    int DoorNo;
    String street;
    String Area;
    String City;
    long pincode;
}
class Account
{
    String name;
    String DoB;
    long AadharNo;
    Address a;
    Scanner sc=new Scanner(System.in);
    Account()
    {
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your DoB(DD.MM.YYYY)");
        DoB=sc.next();
        System.out.println("Enter your AadharNo");
        AadharNo=sc.nextLong();
        System.out.println("Enter your Address:");
        a=new Address();
        System.out.println("Door.No:");
        a.DoorNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Street:");
        a.street=sc.nextLine();
        System.out.println("Area:");
        a.Area=sc.nextLine();
        System.out.println("City:");
        a.City= sc.next();
        System.out.println("Pin-code:");
        a.pincode=sc.nextLong();

        System.out.println("Hi "+name+"..Account created Successfully..");
        System.out.println("You can cast your vote now..");
        Cast cast=new Cast();
        cast.voteCast();

    }
    Account(String name,Long AadharNo)
    {
        this.name=name;
        this.AadharNo=AadharNo;
        System.out.println("Hi "+name+"..Welcome\n");
        System.out.println("You can cast your vote..");
        Cast cast=new Cast();
        cast.voteCast();

    }

}
class Cast
{
    static int party1;
    static int party2;
    static int party3;
    static int nota;
    int vote;
    static int noOfVotes;
    Scanner sc=new Scanner(System.in);
    void voteCast()
    {
        System.out.println("Select to cast your vote\n1.Party-1\n2.Party-2\n3.Party-3\n0.NOTA");
        vote=sc.nextInt();
        switch(vote)
        {
            case 1 -> party1++;
            case 2 -> party2++;
            case 3 -> party3++;
            default -> nota++;
        }
        noOfVotes++;
        System.out.println("Enter 0 to declare result\nOtherwise enter 1");
    }
}

class ElectionResult
{
    void declareResult()
    {

        System.out.println("ELECTION RESULT : ");
        if(Cast.party1>Cast.party2 && Cast.party1>Cast.party3)
        {
            System.out.println("Party-1 Wins");
        }
        else if(Cast.party2>Cast.party3)
        {
            System.out.println("Party-2 Wins");
        }
        else
        {
            System.out.println("Party-3 Wins");
        }
        System.out.println("Total votes:"+Cast.noOfVotes);
        System.out.println("Votes:\nParty-1 -> "+Cast.party1+"\nParty-2 -> "+Cast.party2+"\nParty-3 -> "+Cast.party3+"\nNota -> "+Cast.nota);
    }
}
