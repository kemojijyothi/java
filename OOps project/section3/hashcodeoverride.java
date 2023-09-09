package section3;

public class hashcodeoverride {
    int id;
    String name;
    hashcodeoverride(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        hashcodeoverride h=new hashcodeoverride(56,"jeela");
        System.out.println(h.hashCode());
        System.out.println(h);
        hashcodeoverride h1=new hashcodeoverride(6,"maheswari");
        System.out.println(h1.hashCode());
        System.out.println(h1);
    }

    public int hashcode(){
        return id;
    }
}
