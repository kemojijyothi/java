package encapsulation;

import java.sql.SQLOutput;
//composition example
public class Engine {
    long chosi_no=340;
}
class Car{
    Engine e=new Engine();
}
class MainCar{
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c.e.chosi_no);
    }
}



