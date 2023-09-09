package objectclass;

import java.util.Scanner;

public class EorOddExc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("NUMBER IS POSITIVE");
        }
        else{
            try{
                throw new NegitiveIsNumberException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
