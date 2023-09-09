package objectclass;

import java.util.Scanner;

public class PrimeExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>=1&&n<=50){
            int count=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    count++;
                }
            }
        }
        else{
            try{
                throw new NumberFormatUserException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
}
