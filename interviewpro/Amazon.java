
import java.util.Scanner;
public class Amazon {
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
		System.out.println("1.phonepay\n2.gapay\n3.paytm");
		Scanner sc=new Scanner(System.in);
		System.out.println("choose your choice");
		int choice =sc.nextInt(0);
		switch(choice) {
		case 1:
			System.out.println("click phonepay option");
			break;
		case 2:
			System.out.println("choose gpay option");
			break;
		case 3:
			System.out.println("choose paytm otion ");
			break;
		default:
			System.out.println("invalid choice");
		}
	}
	
}
