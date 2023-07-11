import java.util.Scanner;
class Ewallet2{
    
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
            case 2:password();
            case 3:money();
            
          }


       }
       
       }
       public static void login(){
        System.out.println("enter the username:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
       }
       public static void password(){
        System.out.println("enter the valid password:");
        Scanner sc=new Scanner(System.in);
        int password=sc.nextInt();
        if(password>0){
            
            System.out.println("go to the next process:");
        }
        
       }
       public static void money()
       {
        System.out.println("enter the money:");
        Scanner sc=new Scanner(System.in);
        int money =sc.nextInt();
        {
            public static void  purchase()
                System.out.println("enter the purchse amount:");
                Scanner sc=new Scanner(System.in);
                int purchasesAm=sc.nextInt();
                if(money<purchasesAm){
                    System.out.println("invalid amount:");
                
            }
        }          
       
       }
    
}
   
