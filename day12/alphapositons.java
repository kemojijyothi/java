//WAP to print the alphabets reading is positions 
import java.util.Scanner;
class PositionsAplha{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position");
        int positionvalue=sc.nextInt();
        int positon=0;
        for(char ch="A";ch<="Z";ch++){
            positon++;{
                if(positionvalue==position){
                    System.out.println(ch+" -"+position);
                    break;
                }
            }
        }
    }
}