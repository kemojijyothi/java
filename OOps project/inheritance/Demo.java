package inheritance;

public class Demo {
    int i=200;
    String s="good morning";
    public void display(){
        System.out.println("in display methods");
    }

}
class samplem extends Demo{
    double d=9.4;
    char ch='d';
    public void wish(){
        System.out.println("wish is in sample class");
    }
}
class Mainclass
{
    public static void main(String[] args) {
        samplem s=new samplem();
        System.out.println(s.d);
        s.display();
        s.wish();
    }
}

