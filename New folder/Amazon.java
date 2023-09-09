//Amazon using enpsualation
import java.util.Scanner;
public class Amazon{
	public void ProductName() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the mobile name:");
	String productName1=sc.next();
	System.out.println("enter the price");
	int price =sc.nextInt();

	}
	
}
class onlineepayment extends Amazon{
	public static void payment() {
		boolean res = true;
		while(res){
		System.out.println("1.phonepay\n2.gapay\n3.paytm\n4.Exit");
		Scanner sc=new Scanner(System.in);
	
		System.out.println("choose your choice");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("do the transction using phonepay ");
			break;
		case 2:
			System.out.println("do the transction using gpay");
			break;
		case 3:
			System.out.println("do the transction using paytm ");
			break;
			case 4:
			System.out.println("Exit from the Transaction");
			break;
		default:
			System.out.println("invalid choice");
		   return;
			
		}
	}
}
	
}
class MainAmazon{
	public static void main(String []args){
		onlineepayment o=new onlineepayment ();
		o.ProductName();
		o.payment();
}

}
