//check the person is eligible for army exam or not
import java.util.Scanner;
class ArmyExamQualification{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the person age:");
        int age=scan.nextInt();
        System.out.println("enter the person height:");
        float height=scan.nextFloat();
        System.out.println("enter the person weight:");
        int weight=scan.nextInt();
        if((age>=17&&age<=32)&&(height>=153&&height<=158)&&(weight>=35&&weight<=42))
        {
            System.out.println("person is eligible for the army exam:");
        }
        else{
            System.out.println("person is not eligible for the exam:");
        }
    }
}