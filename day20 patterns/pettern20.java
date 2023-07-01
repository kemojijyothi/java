import java.util.Scanner;
class petter20{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        
        int c=2*r-1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==r||(i+j==r+1)||(j-i==r-1)){
                    
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }   
    
    }
}