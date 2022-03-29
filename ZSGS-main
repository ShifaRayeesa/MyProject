package graduatestudies;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ZSGS
{
    private static final ArrayList<Account> traineeDetails=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    void registeredUsers()
    {
        for(Account i:traineeDetails)
        {
            System.out.println(i.getName()+" "+i.accountType);
        }
    }

    void loginAccount(String loginName,String loginPassword) {
        //System.out.println(loginName+" "+loginPassword);

        for(Account i:traineeDetails)
        {
            if(i.getName().equals(loginName) && i.getPassword().equals(loginPassword))
            {
                System.out.println("Hi " + i.getName() + "..Welcome\n");
                return;
            }
            else if(i.getName().equals(loginName) && !Password.password.equals(loginPassword))
            {
                do
                {
                    System.out.println("Your password is incorrect");
                    System.out.println("Enter password");
                    loginPassword=sc.nextLine();
//                    System.out.println(loginPassword+" "+Password.password);
                }while(!loginPassword.equals(Password.password));
                System.out.println("Hi " + i.getName() + "..Welcome\n");
                return;
            }
        }
        System.out.println("You do not have an account\nPlease create an account..");
        Account acc=new Account();
        traineeDetails.add(acc);

    }

    void viewProfile(String tempName)
    {
        for(Account i:traineeDetails)
        {
            if(tempName.equals(i.getName()))
            {
                System.out.println("Name : \n-->"+i.getName());
                System.out.println("Account-type : \n-->"+i.accountType);
                System.out.println("DOB : \n-->"+i.doB);
                System.out.println("City : \n-->"+i.a.city);
                return;
            }
        }
        System.out.println("No details found!");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        String password;
        String name;
        ZSGS view=new ZSGS();

        do {
            System.out.println("Select an option \n 1.Create Account \n 2.RegiteredUsers \n 3.Login \n 4.View Profile \n 5.Friend Suggestions\n 6.Attendance\n 0.Exit\n");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> {//Register
                    Account account = new Account();
                    traineeDetails.add(account);
                }
                case 2 ->//Registered Users
                        view.registeredUsers();
                case 3 -> {//Login
                    System.out.println("Enter your name:");
                    name = sc.nextLine();
                    System.out.println("Enter password");
                    password = sc.nextLine();
                    view.loginAccount(name, password);
                }
                case 4 -> {//User Details
                    System.out.println("Enter name:");
                    name = sc.nextLine();
                    view.viewProfile(name);
                }
                case 5 -> {//Friend Suggestion
                    FriendSuggestion suggestion = new FriendSuggestion();
                    suggestion.suggestFriends();
                }
                case 6 -> {//Attendance
                    Attendance attendance = new Attendance();
                    attendance.getAttendance();
                }
                case 0 -> System.out.println("Code Exits..");
                default -> System.out.println("Wrong Choice");
            }

        } while (option != 0);
    }
}
//class RegisterOrLogin
//{
//    public String regLogin()
//    {
//        System.out.println("Already have an account?");
//        System.out.println("'Yes' or 'No'");
//        Scanner sc=new Scanner(System.in);
//        String yesOrNo=sc.nextLine();
//        yesOrNo=yesOrNo.toLowerCase();
//        return yesOrNo;
//    }
//}

class Address
{
    int doorNo;
    String street;
    String area;
    String city;
    long pinCode;
}
class Account implements Serializable {
    Scanner sc = new Scanner(System.in);
    String name;
    String doB;
    long aadharNo;
    Address a;
    String accountType;//trainee or faculty
    String password;
    public String getName()
    {
        return name;
    }

    public String getDoB()
    {
        return doB;
    }

    public long getAadharNo()
    {
        return aadharNo;
    }

    public int getDoorNo()
    {
        return a.doorNo;
    }

    public String getStreet()
    {
        return a.street;
    }

    public String getArea()
    {
        return a.area;
    }

    public String getCity()
    {
        return a.city;
    }

    public long getPinCode()
    {
        return a.pinCode;
    }

    public String getPassword() { return password; }
    Account() {
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your DoB(DD.MM.YYYY)");
        doB = sc.nextLine();
        System.out.println("Account-type  -->  Faculty/Trainee");
        accountType= sc.nextLine();
        System.out.println("Enter your AadharNo");
        aadharNo = sc.nextLong();
        System.out.println("Enter your Address:");
        a = new Address();
        System.out.println("Door.No:");
        a.doorNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Street:");
        a.street = sc.nextLine();
        System.out.println("Area:");
        a.area = sc.nextLine();
        System.out.println("City:");
        a.city = sc.nextLine();
        System.out.println("Pin-code:");
        a.pinCode = sc.nextLong();
        sc.nextLine();
        Password obj=new Password();
        while(!obj.checkStrength());
        System.out.println("Hi " + name + "..Account created Successfully..");
        password=Password.password;
        System.out.println(password);
    }
}
