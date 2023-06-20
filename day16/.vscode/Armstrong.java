//armstrong number
class Armstrong
{
  public statc void main(String [] args)
  {
	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
	int temp=n;
	int temp1=n;
	int sum=0;
        while(n>0)
	{
          count++;
	  n/=10;
        }

       while(temp>0)
	{
	  int rem=temp%10;
          int product=1;
          for(int i=1;i<count;i++)
	    {
		product=product*rem;
	    }
        
          sum=sum+product;
          temp/=10;
       }
     if(sum==temp1)
   System.out.println("armstrong number");
    else
     System.out.println("armstrong number");
}
}

