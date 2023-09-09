package objectclass;

import java.util.Scanner;

public class cucexp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME FOR VOTING");
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("vote tp the wise condiate");
        }
        else{
            try{
                throw new NotEligibleToVoteException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
