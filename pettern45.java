import java.util.Scanner;
class pettern45{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
         int k=1;
         char ch='A';
        for(int i=1;i<=r;i++){
            
            
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print(ch+++" ");
                }
                else{
                    System.out.print(k+++" ");
                }

                
        }
        System.out.println();

    }
}
}