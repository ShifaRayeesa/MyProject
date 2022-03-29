package graduatestudies;

import java.util.ArrayList;
import java.util.Scanner;

class FriendSuggestion {
    boolean strCompare(String friend,String fof)
    {
        int i,j;
        return friend.equals(fof);
    }
    void suggestFriends()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no.of friends");
        int noOfFriends=sc.nextInt();
        String[] friends=new String[noOfFriends];
        ArrayList<String> myFriends=new ArrayList<>();
        int[] noFoF=new int[noOfFriends];
        ArrayList<String> friendOFfriend=new ArrayList<>();
       // ArrayList<String> friendSuggestion=new ArrayList<>();
        sc.nextLine();
        System.out.println("Enter --> (friend' 'no.of friends' 'friendOfFriends)");
        for(i=0;i<noOfFriends;i++)
        {
            friends[i]=sc.nextLine();
            String[] temp=friends[i].split(" ");
            myFriends.add(temp[0]);
            noFoF[i]=Integer.parseInt(temp[1]);
            // System.out.println(noFoF[i]);
            for(j=2;j< temp.length;j++)
            {
                friendOFfriend.add(temp[j]);
            }
        }
        System.out.println(myFriends);
        System.out.println(friendOFfriend);

        for(j=0;j<friendOFfriend.size();j++)
        {
            for(i=0;i<myFriends.size();i++)
            {
                boolean trueOrFalse=strCompare(myFriends.get(i),friendOFfriend.get(j));
                if(trueOrFalse)
                {
                    friendOFfriend.remove(j);
                    j--;
                }
            }
        }
        System.out.println(friendOFfriend);
        int ctr,ctr1;
        for(ctr=0;ctr<friendOFfriend.size()-1;ctr++)
        {
            for(ctr1=ctr+1;ctr1<friendOFfriend.size();ctr1++)
            {
                boolean bool=strCompare(friendOFfriend.get(ctr),friendOFfriend.get(ctr1));
                if(bool)
                {
                    friendOFfriend.remove(ctr1);
                    ctr1--;
                }
            }
        }
        System.out.println(friendOFfriend);
    }
}
