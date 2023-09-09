package section3;

public class Amazon {
    public void payment(){
        System.out.println("  cash on delivery");
    }
}
class Amazonpayment extends Amazon{
    public void paymentonline(){
        System.out.println("through the online payment");
    }
}
class AmazonMain{
    public static void main(String []args){
        Amazonpayment a= new Amazonpayment();
        a.paymentonline();
        a.payment();
    }



}


