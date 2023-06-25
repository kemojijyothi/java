class jyothi
{
    public static void main(String[] args) 
     {
          int count = 0 , sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 5000; i++)
        {
             int  n = i;
             int temp=i;
             

            while(n > 0)
            {
                count++;
                n/=10;
            }
              int temp2=i;
            while( temp>0){
                int rem=temp%10;
                int product=1;
                for(int j=1;j<=count;j++)
                {
                    product=product*rem;
                }
                sum=sum+product;
                temp=temp/10;

            }
            if(sum == temp2)
            {
                System.out.print(temp2);
            }
            
           
            
        }
        
            
    }
}