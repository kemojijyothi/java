//the sum of factrorial of each digit in the given  number is eual to the original number those num is called sunny number
class surestrust{
    public static void main(String []args){
        
        for(int i=1;i<=5000;i++){
           {
            int n=i;
            int count=0;
            for(int j=1;j<=n;j++){
                if(j*j==n+1){
                count++;
                n/=10;
                }
            }
            if(count==1){
                System.out.println(i);
            }
          
           
           } 
            
          
           
        }
        

    }
}