package upcasting;

public class Atm{
    public void withDrawMoney(){
        System.out.println("withdraw the money is available here");
    }
}
class pin extends Atm{
    public void createpin(){
        System.out.println("cretae new project is avaible ");
    }

    public static void main(String[] args) {
        Atm a=new pin();//upcasting
        pin p=(pin)a;//downcasting+
        p.withDrawMoney();
        p.createpin();
    }
}
