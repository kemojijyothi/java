import java.util.Scanner;
class SessionYear{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        String seasons=scan.next();
        switch(seasons)
        {
            case "winter":System.out.println(" decmeber");
                          System.out.println(" januavry");
                          System.out.println("febravary");
            break;
            case "spring":System.out.println(" march");
                           System.out.println(" april");
                           System.out.println(" may");
            break;
            case "summer":System.out.println("june");
                          System.out.println("july");
                          System.out.println("august");
            break;
            case "antumn":System.out.println("september");
                          System.out.println("octomber");
            break;
            default:System.out.println(" invalid");
        }
    }
}