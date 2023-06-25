import java.util.Scanner;
class AddOrEven{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int Number=scan.nextInt();
        while(Number%2==0){
            System.out.println(Number+"it is even number");
            break;
           
      
        }
        System.out.println("it is odd");
        
      
    }  
}