package section3;

import org.w3c.dom.ls.LSOutput;

public class Ola {
    String name="madhu";
    public void bookingAlone(){
        System.out.println(name+" is travelling alone");
    }
}
class Olashare extends Ola{
    public void sharedBooking( String strangername){
        System.out.println(name+" is travelling with "+strangername);
    }
}
class MainOla{
    public static void main(String []args){
        Olashare os=new Olashare();
        os.sharedBooking(" pooja");
        os.bookingAlone();
    }
}
