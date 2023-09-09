package encapsulation;

public class Bank {
        private String branchName;
        private String branchCity;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    public int getBranchPin() {
        return branchPin;
    }

    public void setBranchPin(int branchPin) {
        this.branchPin = branchPin;
    }

    private int branchPin;


}
