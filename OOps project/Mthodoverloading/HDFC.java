package Mthodoverloading;

import java.util.Scanner;

public class HDFC {
    public void accountsearch(String accountname){
        System.out.println(" search acaount name with "+accountname);
    }
    public void accoutsearch(long accountnumber){
        System.out.println(" search for phone number"+accountnumber);
    }
    public void accoutsearch(String accountname,long accountnumber){
        System.out.println(" search for phone number"+accountname+accountnumber);
    }
    public void accountsearch(String accountname, String pannumber){

    }
}
class mainHDFC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1:to search with accountname");
        System.out.println("press 2: to search with accountnumber");
        System.out.println("press 3: to serach account with accountname and accountnumber");
        System.out.println(" to search account with accountname and pannumber");
        System.out.println("enter the your choice");
        {
            int c=sc.nextInt();
            HDFC h=new HDFC();
            if(c==1){
                System.out.println("enter the accountname");
                String accountname=sc.next();
                h.accountsearch(accountname);
            }
            else if(c==2){
                System.out.println("enter the accountnumber");
                String accountnuber=sc.next();
                h.accountsearch(accountnuber);
          }
            else if(c==3){
                System.out.println(" enter the accountname and accountnumber");
                String accountname=sc.next();
                long accountnumber=sc.nextLong();

            }
        }
    }
}
