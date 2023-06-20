class ArmStrong{
    public static void main(String []args){
        for(int i=1;i<=5000;i++){
            int n=i;
            int a=i;
            int sum=0;
            int count=0;
            while(n>0){
                count++;
                n/=10;
            }
            while(a>0){
                int rem=a%10;
                int product=1;
                for(int j=1;j<=count;j++){
                    product*=rem;
                }
                sum+=product;
                a/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}