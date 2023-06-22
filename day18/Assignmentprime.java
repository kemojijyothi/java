class Assignmentprime{
    public static void main(String []args){
        int n=1;
        int count=0;
        while(n>0){
            int fact=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    fact++;
                }
            }
            if(fact==2){
                count++;
            }
            if(count==100)
            {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}