import java.util.Scanner;
class CountTheEvenNumAndOddNum{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value for m:");
        int m=scan.nextInt();
        System.out.println("Enter value for n");
        int n=scan.nextInt();
        int evencount=0;
        int oddcount=0;
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
            {
                evencount++;
            }
            else{
                oddcount++;
            }

        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}