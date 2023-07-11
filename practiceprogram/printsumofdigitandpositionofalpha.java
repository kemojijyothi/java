//WAP to print the sum of digit if ti is greater 26.again we will print and gievn position of alphabets
import java.util.Scanner;
class SumofdigitItIsGrater26PrintAlph{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int position=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        if(sum>26){
            int a=sum;
            sum=0;
            
              while(a>0){
                int rem=a%10;
                sum=sum+rem;
                a/=10;
              }
        }
        for(char ch='A';ch<='Z';ch++){
            position++;
            if(sum==position){
                System.out.println(ch+"-"+sum);
            }
        }
    }
}