//write print the spy numvber from 1 to 1000
class spycount{
    public static void main(String [] args){
        for(int i=1;i<=1000;i++)
        {
            int sum=0;
            int product=1;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                sum=sum+rem;
                product=product*rem;
                temp=temp/10;
            }
            if(sum==product)
            {
                System.out.println(i);
            }
        }
    }
}