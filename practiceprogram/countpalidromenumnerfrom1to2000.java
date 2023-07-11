//WAP to count the palidrome number from 1 to 2000
class CountPalidrome{
    public static void main(String []args){
        int count=0;
        
        for(int i=1;i<=2000;i++){
            int rev=0;
            int temp=i;
            
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev==i){
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}