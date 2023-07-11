//WA to print the perfect number from 1 to 100
class PerfectNumberfrom1to100{
    public static void main(String []args){
        int n=100;
        for(int i=1;i<=n;i++){
            int sum=0;
             n=i;
            for(int j=i;j<=i;j++){
                if(n%j==0){
                    sum=sum+j;
                }
                if(sum==n){
                    System.out.println(i);
                }
            }
            
        }
    }
}