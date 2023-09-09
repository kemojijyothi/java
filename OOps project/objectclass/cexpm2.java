package objectclass;

import java.io.IOException;
import java.sql.SQLException;

public class cexpm2 {
    public static void main(String[] args)  {
        System.out.println("main starts");
        m1();
        System.out.println("main ends");
    }
    public static void m1() {
        System.out.println("m1 starts");
        try {
            m2();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void m2() throws SQLException {
        System.out.println("m2 starts");
        m3();
        throw new SQLException();
    }
    public static void m3() {
        System.out.println("m3 starts");
        System.out.println("m3 ends");
    }
}
