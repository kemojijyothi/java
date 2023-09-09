package section3;

public class RBIBank {
    public void intresetrateProvideSubBanks(){
        System.out.println("RBI provind the intresetrate for subbanks is: %6");
    }
}
class SBI extends RBIBank{
    public void intresetForGoldLoan(){
        System.out.println("SBI provinding  the intresetrate for gold loan is:  %1");
    }
    public void intresetForAgriculture(){
        System.out.println("SBI providing the intresetrate for agriculture purpose7 is %1");
    }
}
class customer extends SBI{
    public void createAccount(){
        System.out.println("creating a account in SBI");
    }
    public void educationLoan()
    {
        System.out.println("provind education loan for students");
    }
}
class MainRbi {


    public static void main(String[] args) {
        customer c=new customer();
        c.intresetrateProvideSubBanks();
        c.intresetForGoldLoan();
        c.intresetForAgriculture();
        c.createAccount();
        c.educationLoan();
    }
}


