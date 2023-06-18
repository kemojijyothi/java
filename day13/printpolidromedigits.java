class polidromeNumber{
    public static void main(String [] args){
        int rev=0;
        for(int i=1;i<200;i++){
             int temp=i;
            int rem=i%10;
            rev=rev*10+rem;
            i=i/10;
            System.out.println(temp);
        }
    }
}