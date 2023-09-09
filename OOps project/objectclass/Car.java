package objectclass;

public class Car {
    String brand;
    String color;
    double price;
    String model;
    Car(String brand,String color,double price,String model){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.model=model;
    }

    public static void main(String[] args) {
        Car c1=new Car("BMW","BLACK",800000,"HY2");
        Car c2=new Car("BMW","RED",800000,"HY2");
        Car c3=new Car("BMW","BLACK",800000,"HY2");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c1));
    }


}
