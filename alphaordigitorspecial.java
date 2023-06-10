import java.util.Scanner;
class AlphaOrDigitOrSpecial{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
        {
            System.out.println(ch+"it is alphabet");
        }
        else if(ch>='0'&&ch<='9')
        {
            System.out.println(ch+"it is digit");
        }
        else{
            System.out.println(ch+" it is specialcharacter");
        }
    }
}