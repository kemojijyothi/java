package Stringsprograms.com;

public class OvererideTOString {
    int i;
    String name;
    OvererideTOString(int i,String name){
        this.i=i;
        this.name=name;
    }
    public static void main(String[] args) {
        OvererideTOString ots=new OvererideTOString(8,"jshjhsd");
        System.out.println(ots.toString());
        OvererideTOString ots1=new OvererideTOString(90,"sowmya");
        System.out.println(ots1.toString());
    }
    @Override
    public String toString(){
        return i+" "+name;
    }
}
