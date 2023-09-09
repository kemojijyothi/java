package encapsulation;

public class Passeger {
    String name="vikram";
}
class Bus{
    Passeger p;
    public void addPasseger(Passeger p){
        this.p=p;
    }
}
class MainPasseger{
    public static void main(String[] args) {
        Bus b=new Bus();
        b.addPasseger(new Passeger());
        System.out.println(b.p.name);
    }
}



