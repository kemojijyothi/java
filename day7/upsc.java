import java.util.Scanner;
class UpscExam{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        
        int age=scan.nextInt();
        if(age>=21&&age<=35)
        {
            System.out.println("person is eligible for upsc exam");
        }
        else{
            System.out.println("person is not eligible for upsc exam");
        }
        

    }
}