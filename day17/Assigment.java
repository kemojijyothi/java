//armstrong number
class Assigment{
    public static void main(String []args){
      int sum=0;

        for( int i=1;i<=500;i++)
     {
        int n=i;
        int temp=n;
        
        int count=0;
       
        while(n>0){
            count++;
            n=n/10;
        }
       
        while(temp>0){
            int rem=temp%10;
            int pro=1;
            for(int j=1;j<=rem;j++){
                pro=pro*rem;
            }
            sum=sum+pro;
            temp=temp/10;
        }
         if(sum==n){
        System.out.println(n);
     }
        
     }
    
    }

}