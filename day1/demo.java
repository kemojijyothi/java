//all artimetic operators using char and number type
class Demo
{
 public static void main(String [] args)
 {
    int num1=20;
    char char1='a';
    char char2='b';
    System.out.println(num1+char1);
    System.out.println(num1 + " adding number and char "+ char1+" = " +(num1+char1));
    System.out.println(char1 + " adding two characters "+ char2+ "= "+(char1+char2));
    System.out.println(char1 + " subtracting two  characters "+ char2+ "= "+(char1-char2));
    System.out.println(char1 + " multiplication two characters "+ char2+ "= "+(char1*char2));
    char char3='d';
    System.out.println(char1 + " division two characters "+ char3 + "= "+(char1/char3));
    System.out.println(char1 + " module two characters "+ char3+ "= "+(char1%char3));
 }
}
