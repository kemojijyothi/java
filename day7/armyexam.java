import java.util.Scanner;
class ArmyExam1{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        int height=scan.nextInt();
        int weight=scan.nextInt();
        if(age>=17 && age<=23 )
        {
            if(height==152 && weight==42){
            System.out.println(" person is eligible for army exam");
            }
        }
        else{
            System.out.println(" person is not eligible for army exam");
        }
    }
}