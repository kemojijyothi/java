package section3;
//hashcode() return the int type of data. hashcode means unique indentification of integer type of data
public class Hashode {
    public static void main(String[] args) {
        Hashode h=new Hashode();
        System.out.println(h.hashCode());//int type
        Hashode h1=new Hashode();
        System.out.println(h1.hashCode());//int type
        System.out.println(h1);//it prints packagename.classname2hashcode in hexadecimal format

    }
}
