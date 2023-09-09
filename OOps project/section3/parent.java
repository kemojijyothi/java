package section3;

public class parent {
    parent(){
        this(5);
        System.out.println(" parent classs non parametized");
    }
    parent(int i){
        System.out.println(" parent class int type");
    }
}
class childclass extends parent{
    childclass(){
        this(6.8);
        System.out.println(" childclass non parameteized");
    }
    childclass(double d){
        System.out.println(" childclass double type");
    }

    public static void main(String[] args) {
        childclass cc=new childclass();
    }
}

