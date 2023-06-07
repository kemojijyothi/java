import java.util.Scanner;
class VoteEligible{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter person corrent age :");
        int age=scan.nextInt();
        if(age>=18)
        {
            System.out.println("person is eligible person for vote");
        }
        else{
            System.out.println("person not eligible person for vote");
        }

    }
}