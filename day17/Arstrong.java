class Arstrong{
    public static void main(String []args){
        for(int i=1;i<=500;i++){
            int n=i;
            int temp=i;
            int count=0;
            int sum=0;
            while(n>0){
                count++;
                n/=10;
            }
            while(temp>0){
                int rem=temp%10;
                int product=1;
                for(int j=1;j<=count;j++){
                    product=product*rem;
                }
                sum=sum+product;
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}