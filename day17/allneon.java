class Assignmentneon{
    public static void main(String []args){
        for(int i=1;i<=100000;i++){
            int n=i*i;
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem;
                n/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
            
        }
    }
}