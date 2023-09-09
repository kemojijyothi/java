package section3;
//equals method example
public class CAR1 {
    String brand;
    String color;
    double price;
    String model;
    CAR1(String brand, String color, double price, String model){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.model=model;
    }
    public boolean equals(Object ob){
        CAR1 c= (CAR1)ob;
        boolean b=brand.equals(c.brand)&&color.equals(color)&&price==c.price&&model.equals(c.model);
        return b;
    }

}
class Maincar{
    public static void main(String[] args) {
        CAR1 c1=new CAR1("BMW","BALCK",8000000,"G3");
        CAR1 c2=new CAR1("BMW","BALCK",8000000,"L2");
        CAR1 c3=new CAR1("BMW","BALCK",8000000,"G3");
        System.out.println("COMPARE TWO ONE OBJ TO SECOND OBJ");
        boolean res=c1.equals(c2);
        if(res){
            System.out.println(" both are same obj");
        }
        else{
            System.out.println("different obj");
        }
        boolean res1=c1.equals(c3);
        if(res1){
            System.out.println(" both are same objects");
        }
        else{
            System.out.println(" both different obj");
        }
    }
}
