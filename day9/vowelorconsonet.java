import java.util.Scanner;
class AlphabetVowel{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        Char alpha =scan.next().charAt(0);
        if(alpha=='a'&&alpha=='e'&&alpha=='i'&&alpha=='o'&&alpha=='u'&&alpha=='A'&&alpha=='E'&&alpha=='I'&&alpha=='O'&&alpha=='U')
             {
                    System.out.println(" vowel");
             }
             else{
                System.out.println("consonect");
             }
    }

}