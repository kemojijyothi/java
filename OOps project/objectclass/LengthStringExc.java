package objectclass;

import java.util.Scanner;

public class LengthStringExc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        int count=0;
        for(int i=0;i< str.length();i++){
            count++;
        }
        if(count%2==0){
            System.out.println("length of the string is evennumber");
        }
        else{
            try{
                throw new OddNumberFormatException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
