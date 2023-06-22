import java.util.Scanner;
class primenumber{
    public static void main(String []args){
        int num=1,count=0,i;
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(count<n){
            num=num+1;
            for(i=2;i<=num;i++){
                if(num%i==0){
                    break;
                }
            }
            if(i==num){
                count=count+1;

            }
        }
        System.out.println("the"+n+"th prime number is:"+num);
    }
}