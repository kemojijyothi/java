//WAP to print the all sum of even nuber from 25 to 60
class SumOfEvenFrom21to60{
    public static void main(String []args){
        int sum=0;
            for(int i=25;i<=60;i++)
            {
                if(i%2==0)
                {
                    sum=sum+i;
                }
            }
            System.out.println("sum of even number from 25 to 60 :"+ sum);
    }
}