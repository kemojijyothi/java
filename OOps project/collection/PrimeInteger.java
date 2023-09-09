package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PrimeInteger {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("enter the sixe of arrylist:");
        int n = sca.nextInt();
        System.out.println("enter the elemts inside the arraylist");
        for (int i = 0; i < n; i++) {
            num.add(sca.nextInt());
        }
        System.out.println(num);

        for (int j = 0; j < num.size(); j++) {
            Object ob = num.get(j);
            ArrayList<Integer> a = null;
            if (ob instanceof Integer) {
                Integer n1 = (Integer) ob;
                int count = 0;
                for (int k = 1; k < n1; k++) {
                    if (n1 % k == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    ArrayList<Integer> l = new ArrayList<>();
                        l.add( n1);
                    System.out.println(l);
                }
            }
        }
    }
}