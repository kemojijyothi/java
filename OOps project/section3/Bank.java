package section3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    private String accountname;
    private int pin;
    private int balance;

    public String getName() {
        return accountname;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(long phonenumber) {
        this.pin = pin;
    }

    public int getbalance() {
        return balance;
    }

    public void setGmail(String gmail) {
        this.balance= balance;
    }

    public void setName(String accountname) {
        this.accountname= accountname;
    }
    public void input(){

        Scanner sc=new Scanner(System.in);
            System.out.println("press1.SAVING ACCOUNT\npress2.CURRENT ACCOUNT\n3.EXIT");
        System.out.println("enter your choice:");
            int choice=sc.nextInt();
            {
            switch (choice) {

                case 1:
                    System.out.println("proceed to the saving account process");
                    CheckTypeOfAccount();
                    break;
                case 2:
                    System.out.println("proceed to the current account process");
                    CheckTypeOfAccount();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");


            }

        }

    }
    public void CheckTypeOfAccount() {
        Scanner sc = new Scanner(System.in);


                 System.out.println("ENTER YOUR PIN:");
                 pin = sc.nextInt();
                 int count = 0;
                 while (pin > 0) {
                     count++;
                     pin = pin / 10;
                 }

                 if (count == 6) {
                     System.out.println("PROCED TO THE PROCESS");

                 } else {
                     System.out.println("ENTER VALID PIN");
                       pin =sc.nextInt();

                 }
                 input2();
             }
        public void input2(){
            Scanner sc=new Scanner(System.in);
            System.out.println("CHECK YOUR BALANCE:");
            balance =sc.nextInt();
             if(balance>0){
                 System.out.println("balance Available: " + balance);
             }
             else{
                 System.out.println("balance is not available");
             }
        }
    }


