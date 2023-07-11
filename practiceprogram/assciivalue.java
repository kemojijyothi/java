//WAP to print the particular the alphabet reading is position 
import java.util.Scanner;
class AssciiValueForLowerCase{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position value ");
        int positionasscii=sc.nextInt();
        int position=96;
        for(char ch='a';ch<='z';ch++){
            position++;
            if(positionasscii==position){
                System.out.println(ch+"-"+position);
                break;
            }
        }
    }
}