package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        System.out.println("enter the values from the arraylist");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=0;i<=10;i++){
            a1.add(s.nextInt());
        }
        System.out.println(a1);
        Iterator its=a1.iterator();
        while(its.hasNext()){
            Object od=its.next();
            Integer i=(Integer) od;
            if(i%2==0){
                System.out.println(i);
            }
            else{
                its.remove();
            }

        }
        System.out.println(a1);
    }
}
