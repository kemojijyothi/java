package section3;

public class Travel {
    public void journey(){
        Bike b=new Bike();
        b.go();
        System.out.println("to bangalore");
    }
}
class Bike{
    public void go(){
        System.out.println("go in bike");
    }
}
class MainTravel{
    public static void main(String[] args) {
        Travel t=new Travel();
        t.journey();
    }
}
