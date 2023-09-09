package section3;

public class Father {
    public void display(){
        System.out.println("parent class");
    }
}

class Child extends Father{
    public void show(){
        System.out.println("child class members");
    }
}
class MainClass{
    public static void main(String[] args) {
        Father f=new Father();
        f.display();
        Child c=new Child();
        c.display();
    }
}
