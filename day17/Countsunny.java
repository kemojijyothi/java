class Count{
    public static void main(String []args)
    {
         int count=0; 
        for(int i=1;i<=10;i++){
           {
             int n=i;          
             for(int j=1;j<=n;j++){
                if(j*j==n+1){
                count++;
                n/=10;
                }
            }
            } 
            
        }
        System.out.println(count);
        
        
    }
}