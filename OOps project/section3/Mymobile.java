package section3;

public class Mymobile {
    public void call(int oneperson){
        System.out.println(" call with  "+oneperson+" person");
    }
    public void call(short conference){
        System.out.println(" call with"+ conference+" person");
    }
    public void call(String vediocall){
        System.out.println(vediocall);
    }
}
class   Accordingcall extends Mymobile{
    public static void main(String[] args) {
        Mymobile m=new Mymobile();
        m.call(1);
        m.call(2);
        m.call("video calloption is availble");

    }
}

