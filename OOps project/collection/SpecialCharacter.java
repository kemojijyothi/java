package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> sample = new ArrayList<>();
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the charracters into the character array");
        for (int i = 0; i <= n; i++) {
            sample.add(sc.next().charAt(0));
        }
        System.out.println(sample);
        for (int i = 0; i < sample.size(); i++) {
            Object ob = sample.get(i);
            if (ob instanceof Character) {
                Character ch = (Character) ob;
                for (int j = 0; j < n; j++) {
                    if (!(ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9'||ch>='a'&&ch<='z')) {
                        System.out.println(ch);
                        break;
                    }

                }
            }
        }
    }
}
