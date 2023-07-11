//WAP to print the all the Neon from 1 to 10000
class NeonNUmberFrom1to1000{
    public static void main(String []args){
        for(int i=1;i<=1000;i++){
            int temp=i;
            int sum=0;
            int a=i*i;
            while(a>0){
                int rem=a%10;
                sum=sum+rem;
                a=a/10;

            }
            if(sum==temp){
                System.out.println(temp);
            }
        }
    }
}