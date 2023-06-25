//WAP to print the month number reading month name
import java.util.Scanner;
class MonthNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month name:");
        String monthname=sc.nextLine();
        switch(monthname)
        {
            case " januavary":System.out.println(1);
            break;
            case " feb":System.out.println(2);
            break;
            case " march":System.out.println(3);
            break;
            case " april":System.out.println(4);
            break;
            case " may":System.out.println(5);
            break;
            case "june":System.out.println(6);
            break;
            case " july":System.out.println(7);
            break;
            case " august":System.out.println(8);
            break;
            case " septomeber":System.out.println(9);
            break;
            case " octomber":System.out.println(10);
            break;
            case "november":System.out.println(11);
            break;
            case "december":System.out.println(12);
            break;
        }

    }
}