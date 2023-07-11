import java.util.Scanner;
class Ewallet{
    static int money=20000;
   
    
    public static void login(){
        System.out.println("enter the username :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        password();;
    }
    static int ewallet=260;
    public static void password(){
        System.out.println("enter the valid password:");
        Scanner sc=new Scanner(System.in);
        int password=sc.nextInt();
        
        if(password==ewallet){
            System.out.println("valid user cresendtials proceed to next process:");
        }
        addmoney();

    }
    
    public static void addmoney(){
        System.out.println("the total amount is:"+money);
        purchase();

    }
     static int purchaseamount=2000;
    public static void purchase(){
        
        
        System.out.println("the current balance amount is:"+(money-purchaseamount));
        rechegeamount();
    }

    public static void rechegeamount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rechageamount:");
        int rechargebleamount=sc.nextInt();
        
        int balanceamount=money+rechargebleamount;
        System.out.println("the total balance:"+balanceamount);
        logout();
    }
    public static void logout(){
        System.out.println("succefully logout");
    }


    public static void main(String []args){
        System.out.println("welcome Ewalletpage");
        login();

    }
}