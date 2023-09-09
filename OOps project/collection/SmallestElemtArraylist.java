package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestElemtArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("enter the sixe of arrylist:");
        int n = sc.nextInt();
        System.out.println("enter the elemts inside the arraylist");
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        int min=num.get(0);

        for (int j = 1; j < num.size(); j++) {
            if(min>num.get(j))
            {
                min=num.get(j);
            }

        }
        System.out.println(min);
    }
}
