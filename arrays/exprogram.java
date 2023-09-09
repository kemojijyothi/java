//character array
import java.util.Scanner;
class program{
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size ");
       int n=sc.nextInt();
       char a[]=new char[n];
       System.out.println("enter the array value");
       for(int i=0;i<n;i++){
        a[i]=sc.next().charAt(0);
       } 
       for(char i:a){
        System.out.println(i+" ");
       }
    }
}