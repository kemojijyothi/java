package inheritance;

public class Ola {
    String name="mamatha";
    public void bookingAlone(){
        System.out.println(name+" :IS TRAVALLING ALONE");
    }
}
class Olashare extends Ola{
    public void sharebooking(String strangerName){
        System.out.println(name+" :is travalling with:"+strangerName);
    }
}
class MainOla{
    public static void main(String[] args) {
        Olashare s=new Olashare();
        s.sharebooking("jyothi");
        s.bookingAlone();
    }
}

