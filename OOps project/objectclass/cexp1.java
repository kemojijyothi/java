package objectclass;

import java.io.IOException;

public class cexp1 {
    public static void main(String[] args)  {
        System.out.println("main starts");
        try{
           m1();
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("main ends");

    }
    public static void m1() throws IOException {
        System.out.println("m1 starts");
        m2();
        System.out.println("m1 ends");
    }
    public static void m2() throws IOException {
        System.out.println("m2 starts");
        m3();
        System.out.println("m1 ends");
    }
    public static void m3() throws IOException {
        System.out.println("m3 starts");
        throw new IOException("file not found");
    }
}
