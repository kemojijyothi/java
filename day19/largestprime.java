// print the largest five digit number
import java.util.Scanner;
class primelargest{
    public static void main(String[] args){
       
        for(int n =99999;n>=10000;n++)
        {

           int fact=0;
           for(int i=1;i<=n;i++)
           {
            if(n%i==0){
                fact++;
            }
           }
        if(fact==2){
            System.out.println(n);
        }
       }
    }
}