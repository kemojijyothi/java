import java.util.Scanner;
class Example{
public static void amin(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the rows:");
	int row=scan.nextInt();
        for(int i=1;i<=row;++i)
	{
		for(int j=1;j<=row;++j)
		{
		  System.out.print("*");
		}
	}
	System.out.println();
}

}