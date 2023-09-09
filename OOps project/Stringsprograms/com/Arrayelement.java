package Stringsprograms.com;

import java.util.Scanner;

public class Arrayelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array element");
        for(int i=0;i<=n;i++){
            int element=sc.nextInt();
            if(element<0){
                a[i]=element;
            }
            else {
                try{
                    throw new PositiveNumberException();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }


}
