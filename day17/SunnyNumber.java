import java.util.Scanner;
class sunnyex{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i*i==n+1){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println(n+" sunny number");

        }
        else{
            System.out.println( n+" it is not sunny number");
        }

        

    }
}