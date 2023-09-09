package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("enter the sixe of arrylist:");
        int n = sc.nextInt();
        System.out.println("enter the elemts inside the arraylist");
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);
        System.out.println(num);



    }
}
