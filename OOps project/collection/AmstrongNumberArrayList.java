package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AmstrongNumberArrayList {
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
        for(int j=0;j<num.size();j++)
          System.out.println(num.get(j));

        }
}

