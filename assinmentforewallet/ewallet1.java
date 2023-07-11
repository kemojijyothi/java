import java.util.Scanner;
class Ewallet1{
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME EWALLET PAGE:");
       System.out.println("enter the valid cresendials:");
       System.out.println("press 1:login\npress 2:password\npress 3:addmoney\npress 4:purchse\npress 5:rechagreamount\npress 6:logout");
       {
          Scanner scan =new Scanner(System.in);
          System.out.println("enter the choice:");
          int choice=scan.nextInt();
          switch(choice){
            case 1:login();
          }


       }
       
       }
       public static void login(){
        System.out.println("enter the username:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
       }
    
}
   
