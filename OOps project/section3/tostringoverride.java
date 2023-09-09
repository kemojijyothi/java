package section3;

public class tostringoverride {
    int id;
    String name;
    tostringoverride(int id,String name){
        this.id=id;
        this.name=name;

    }

    public static void main(String[] args) {
        tostringoverride t=new tostringoverride(34,"vikram");
        System.out.println(t.toString());
        //System.out.println(t);
        tostringoverride t2=new tostringoverride(89,"bharath");
        System.out.println(t2.toString());
        //System.out.println(t2);
    }
    @Override
    public String toString(){
        return id+" "+name;
    }
}
