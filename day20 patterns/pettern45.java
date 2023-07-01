import java.util.Scanner;
class pettern45{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th row:");
        int r=sc.nextInt();
        System.out.println("enter the cloumns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            char ch='A';
            for(int j=1;j<=c;j++){
                if(i%2==1){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(ch+++" ");

                }
            }
            System.out.println();
        }

        

    }
}