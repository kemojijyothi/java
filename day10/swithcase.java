import java.util.Scanner;
class SwitchCase{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        switch(ch){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
            System.out.println(ch+" it is vowel");
            break;
            default:System.out.println("invalide");
            



        }
    }
}