package inheritance;

public class call {
    String name="bsjfbvjxvb";
    public void  normalcall(){
        System.out.println("only normal call is available");

    }
}
class videocall extends call{
    int i=90;
    public void vdcall(){
        System.out.println("normal call with video call is available here");
    }
}
class MainCall{
    public static void main(String[] args) {
        videocall c=new videocall();
        System.out.println(c.i);
        System.out.println(c.name);
        //System.out.println(c.normalcall());


    }
}


