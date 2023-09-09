import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class Bnak{
    private int accountnumber;
    private int balance;
    private int phonenumber;
    public int getAcoountnumber() {
        return accountnumber;
    }
    public void setAcoountnumber(int acoountnumber) {
        this.accountnumber = accountnumber;
        
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
   

public void input(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the account number: ");
    accountnumber = sc.nextInt();
    
    
    
}
}
