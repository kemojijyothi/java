import java.util.Scanner;
class Ewalletpro
{
     static int money=0;
     static int  balance=0;
     static int purchasesAm=0;
     public static void login()
     {
        System.out.println("enter the username:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();  
       }
       public static void password()
       {
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
         money =sc.nextInt();
       }
        public static void  purchase()
        {
                System.out.println("enter the purchse amount:");
                Scanner sc=new Scanner(System.in);
                 purchasesAm=sc.nextInt(); 
                if(money>purchasesAm){
                    System.out.println("PROCESED TO THE PURCHSE THE PRODUCT:");
                    balancechek();
                }
                else{
                    System.out.println("inavalid amount:");
                   }
                   
        }
        public static void balancechek(){
            if(money>purchasesAm)
            balance=money-purchasesAm;
            System.out.println("after purchaseing the item a/c balance is"+"="+balance);
            recharge();
        }
        public static void recharge()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the recharge amount to wallet:");
            int rechargeAm=sc.nextInt();
            int currentbalance=rechargeAm+balance;
            System.out.println("current balance is:"+"="+currentbalance);
            logout();
        }
        public static void logout()
        {
            System.out.println("succefully logout ");
        } 
       
       public static void main(String []args)
       {
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
             case 4:purchase();
                    break;
             
           }
 
 
        }
        
}
}
    

   
