import java.util.Scanner;
class pettern14{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");                     
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                
                    System.out.print("*"+" ");
                           
            }
            System.out.println();
        }
        
    }
}
output:
enter the number of rows:
6
enter the number of column:
6
* 
* * 
* * *
* * * *
* * * * *
* * * * * *
