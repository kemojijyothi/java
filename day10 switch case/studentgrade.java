import java.util.Scanner;
class StudentGrade{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" enter marks for subejct1:");
        int m1=scan.nextInt();
        System.out.println("enter marks for subject2:");
        int m2=scan.nextInt();
        System.out.println("enter marks for subject3:");
        int m3=scan.nextInt();
        double total=m1+m2+m3;
        double avg=total/3;
        System.out.println("all subject avarage marks is :"+avg);
        if(avg>=91&&avg<=100)
        {
            System.out.println("outstanding");
        }
        else if(avg>=81&&avg<=91)
        {
            System.out.println("very good");
        }
        else if(avg>=71&&avg<=81){
            System.out.println("good");
        }
        else if(avg>=61&&avg<=71)
        {
            System.out.println(" average");
        }
        else if(avg>=51&&avg<=61)
        {
            System.out.println(" below average");
        }

        else{
            System.out.println(" fail");
        }
    }
}