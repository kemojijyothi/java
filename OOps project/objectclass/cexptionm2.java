package objectclass;

import java.io.IOException;

public class cexptionm2 {
    public static void main(String[] args)  {
        System.out.println("main starts");
        m1();

        System.out.println("main ends");

    }
    public static void m1(){
        System.out.println("m1 starts");
        m2();
        System.out.println("m1 ends");
    }
    public static void m2()  {
        System.out.println("m2 starts");
        try{
            m3();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("m2 ends");
    }
    public static void m3() throws IOException {
        System.out.println("m3 starts");
        throw new IOException("file not found");
    }
}
