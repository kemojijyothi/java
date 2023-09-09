package section3;
//upcasting
public class Bag {
    public void additems(){
        System.out.println("items added to bag");
    }
}
class books extends Bag{
    public void removeitem(){
        System.out.println("items removed from bag");
    }
}
class MainBag{
    public static void main(String[] args) {
        Bag b=new books();
        b.additems();
        // b.removeitem();we connot access child class members
    }
}
