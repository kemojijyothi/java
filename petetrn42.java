import java.util.Scanner;
class pettern42{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
       char ch='A';
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=c;j++){
                if(j%2==1)
                System.out.print(i+" ");
                else{
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
            ch++;
        }

    }
}