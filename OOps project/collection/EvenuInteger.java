package collection;

import java.util.Scanner;
import java.util.ArrayList;

public class EvenuInteger {
    public static void main(String[] args) {

        System.out.println("enter the array sixe");
        ArrayList a1=new ArrayList();
        a1.add(56);
        a1.add("sgf");
        a1.add(98.67);
        a1.add(58);
        a1.add(78);
        a1.add(77);
        for(int i=0;i<a1.size();i++){
            Object ob=a1.get(i);
            if(ob instanceof Integer){
                Integer n=(Integer)ob;//dowcasting -->converting super class object to the subclass type
                int num=n;
                if(num%2==0){
                    System.out.println(num);
                }
            }
        }

    }
}
