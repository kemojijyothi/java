package objectclass;

public class HashcodeOverride {
    int i;
    String name;
    long phonenumber;
    HashcodeOverride(int i,String name,long phonenumber){
        this.i=i;
        this.name=name;
        this.phonenumber=phonenumber;
    }

    public static void main(String[] args) {
        HashcodeOverride h=new HashcodeOverride(1,"jyothi",9876564356l);
        System.out.println(h.hashCode());
        HashcodeOverride h1=new HashcodeOverride(2,"Kemoji jyothi",8967542356l);
        System.out.println(h1.hashCode());

    }
    @Override
    public int hashCode(){
        return i;
    }


}
