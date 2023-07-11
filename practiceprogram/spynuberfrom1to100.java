//WAP to print the psy number form 1 to 100
class SpayNumFrom1to100{
    public static void main(String []args){
        for(int i=1;i<=1000;i++){
            int sum=0;
            int product=1;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                product*=rem;
                temp/=10;

            }
            if(sum==product){
                System.out.println(i);
            }
        }
    }
}