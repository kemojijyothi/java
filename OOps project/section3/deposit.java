package section3;

public interface deposit {
    void Amountdeposi();
}
interface withdraw{
    void Amountwithdraw();
}
class atm implements deposit,withdraw{

    @Override
    public void Amountdeposi() {
        System.out.println("deposit the money through the atm");
    }

    @Override
    public void Amountwithdraw() {
        System.out.println(" with draw the money through the atm");
    }
}
class MainAtm{
    public static void main(String[] args) {
        deposit d=new atm();
        d.Amountdeposi();
        withdraw w=new atm();
        w.Amountwithdraw();
    }



}
