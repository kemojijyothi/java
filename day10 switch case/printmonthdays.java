//WAP to print the month number reading month name
import java.util.Scanner;
class MonthDays{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month name:");
        String monthname=sc.nextLine();
        switch(monthname)
        {
            case " januavary":System.out.println(31);
            break;
            case " feb":System.out.println(30);
            break;
            case " march":System.out.println(31);
            break;
            case " april":System.out.println(28);
            break;
            case " may":System.out.println(31);
            break;
            case "june":System.out.println(30);
            break;
            case " july":System.out.println(31);
            break;
            case " august":System.out.println(31);
            break;
            case " septomeber":System.out.println(30);
            break;
            case " octomber":System.out.println(31);
            break;
            case "november":System.out.println(30);
            break;
            case "december":System.out.println(30);
            break;
        }

    }
}