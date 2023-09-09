package section3;

public class RBI {
    public int intresetrate(){
        return 0;
    }
}
class HDFC extends RBI{
    public int intresetrate(){
        return 5;
    }
}
class ICICI extends RBI{
    public int intresetrate(){
        return 7;
    }
}
class AXIX extends RBI{
    public int intresetrate(){
        return 9;
    }
}
class MainRBI{
    public static void main(String[] args) {
        RBI ref;
        ref=new HDFC();
        System.out.println(ref.intresetrate());

    }
}


