import java.util.Scanner;
class Ewallet{
    
    static int  epass=260;
    
    public static void login(){
        System.out.println("enter the username :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        password();
    }
    
    public static void password(){
        System.out.println("enter the valid password:");
        Scanner sc=new Scanner(System.in);
        int password=sc.nextInt();
        
        if(password==epass){
            System.out.println("valid user cresendtials proceed to next process:");
        }
        addmoney();

    }
    
    public static void addmoney(){
        
        System.out.println("the total amount is:");
       

    }
     
    public static void purchase(){
        Scanner sc=new Scanner(System.in);
        System.out.println("purchase amount ");
        int purchaseamount=sc.nextInt();
        System.out.println("purchase amount "+purchaseamount);
        
    }

    public static void rechegeamount(){
        
        logout();
    }
    public static void logout(){
        System.out.println("succefully logout");
    }


    public static void main(String []args){
        System.out.println("welcome Ewalletpage");
        login();
        System.out.println("enter the money");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        System.out.println("total money"+money);
        purchase();
        Scanner sc=new Scanner(System.in);
        System.out.println("purchase amount ");
        int purchaseamount=sc.nextInt();
        System.out.println("purchase amount "+purchaseamount);
        
        System.out.println("the current balance amount is:"+(money-purchaseamount));
        System.out.println("successfully purchse");
        rechegeamount();
        System.out.println("enter the rechageamount:");
        int rechargebleamount=sc.nextInt();
        
        int balanceamount=money+rechargebleamount;
       

    }
}