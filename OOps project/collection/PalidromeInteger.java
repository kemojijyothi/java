package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PalidromeInteger {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();
        System.out.println("enter the sixe of arrylist:");
        int n= sca.nextInt();
        System.out.println("enter the elemts inside the arraylist");
        for(int i=0;i<n;i++){
            num.add(sca.nextInt());
        }
        System.out.println(num);

        for(int j=0;j<num.size();j++){
            Object ob=num.get(j);
            if(ob instanceof Integer)
            {
                Integer n1=(Integer) ob;
                int rev=0;
                int temp=n1;
                while(n1>0){
                    int rem=n1%10;
                    rev=rev*10+rem;
                    n1=n1/10;
                }
                if(rev==temp){
                    System.out.println(rev);
                }

            }
        }
}}
