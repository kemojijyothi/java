//WAP to print the armstrong number from 1 to 5000
class PrintTheArmStrongNumberFrom1to5000{
    public static void main(String []args){
        for(int i=1;i<=5000;i++){
            int n=i;
            int a=i;
            int temp=i;
            int count=0;
            int sum=0;
            while(n>0){
                count++;
                n=n/10;
            }
            
            while(a>0){
                int rem=a%10;
                int product=1;
                for(int j=1;j<=count;j++){
                    product=product*rem;
                }
                sum=sum+product;
                a=a%10;
            }
            if(sum==temp){
                System.out.println(temp);
            }
        }
    }
}