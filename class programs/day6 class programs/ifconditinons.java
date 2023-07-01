import java.util.Scanner;


class IfConditions
{
    public static void main (String[] args)
    {
        // your code goes here
        int b = 50;
        int r = 45;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");//chec the condiotion 45>50 false go for next condition
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");//same check for the condition 50==45 false go for next condition
        }
        
        b = 15;//update the values 
        r= 15;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");// 15>15 false go for next conditions
        }
        else if(r==b){
            System.out.println("Bob & Rob both scored the same");//15==15 its true print the output is Bob & Rob both scored the same 
        }
        
    }
}