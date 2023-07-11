//WAP to count the product of even number count the sum of odd number range is from 53 to 109
import java.util.Scanner;
class CountEvenNumberAndCountOddNumber{
    public static void main(String []args){
        int product=1;
        int sum=0;
        int productcount=1;
        int sumcount=0;
        for(int i=53;i<=109;i++){
            if(i%2==0){
                product*=i;
                productcount++;
            }
            else{
                sum+=i;
                sumcount++;
            }
        }
        System.out.println("product of evennumbers:"+productcount);
        System.out.println("sum of oddnumbers:"+sumcount);
    }
}