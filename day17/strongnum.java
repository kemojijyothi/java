class factorialex{
    public static void main(String[] args){
        for(int i=1;i<=2500;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                int fact=1;
                for(int j=1;j<=rem;j++){
                    fact=fact*j;
                }
                sum=sum+fact;
                temp=temp/10;
            }
        }
        if(sum==i){
            System.out.println("strong number");
        }
    }
}