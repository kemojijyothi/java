import java.util.Scanner;
class GreaterAmongFourDigits
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
       System.out.println("enter vlaue for num1:");
        int num1=scan.nextInt();
        System.out.println("enter vlaue for num2:");
        int num2=scan.nextInt();
        System.out.println("enter vlaue for num3:");
        int num3=scan.nextInt();
        System.out.println("enter vlaue for num4:");
        int num4=scan.nextInt();
        if((num1>num2)&&(num1>num3)&&(num1>num4))
        {
            System.out.println(num1+" is greater");
        }
        else if((num2>num3)&&(num2>num4)){
            System.out.println(num2+" is greater ");
        }
        else if((num3>num4))
        {
            System.out.println(num3+" is greater");
        }
        else{
            System.out.println(num4+" is greater");
        }

    }
}