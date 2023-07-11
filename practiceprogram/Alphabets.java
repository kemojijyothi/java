//WAP to print the particular the alphabet reading is position 
import java.util.Scanner;
class Aplhabets{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position value ");
        int positionvalue=sc.nextInt();
        int position=0;
        for(char ch='A';ch<='Z';ch++){
            position++;
            if(positionvalue==position){
                System.out.println(ch+"-"+position);
                break;
            }
        }
    }
}