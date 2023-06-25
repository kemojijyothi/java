//WAP to print the all sum of even nuber from 25 to 60
class SumOfoddFrom15to25{
    public static void main(String []args){
        int sum=0;
            for(int i=15;i<=25;i++)
            {
                if(i%2!=0)
                {
                    sum=sum+i;
                }
            }
            System.out.println("sum of odd number from 15 to 25 :"+ sum);
    }
}