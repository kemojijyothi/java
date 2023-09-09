package encapsulation;

public class MainBank {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setBranchName("Canara bank");
        b.setBranchCity("kurnool");
        b.setBranchPin(876);
        System.out.println(b.getBranchName());
        System.out.println(b.getBranchCity());
        System.out.println(b.getBranchPin());
    }
}
