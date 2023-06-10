import java.util.Scanner;
class AlphabeticOrDigitOrSpecialChar{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter any Alphabet:");
        char Alpha=scan.next().charAt(0);
       if((Alpha>='a' && Alpha<='z')||(Alpha<='A'&& Alpha>='Z'))
        {
            System.out.println(Alpha+" is Alphabetic ");
        }
        else if(Alpha>=0&&Alpha<=9)
        {
            System.out.println(Alpha+" it is a digit");
        }
        else if((Alpha>=32&&Alpha<=47)||(Alpha>=58&&Alpha<=64)||(Alpha<=91&&Alpha>=96)||(Alpha<=123&&Alpha>=126))
        {
            System.out.println(Alpha+ "  it is special char:");
        }

    }
}