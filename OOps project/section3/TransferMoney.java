package section3;

import java.util.Scanner;

public interface TransferMoney {
    void selectConduct();
    void amount();

    void tupi();
}
interface Balance{
     void bupi();
     void checkbalance();
}
interface Recharge{
    void selectsim();
    void rupi();
}
class phonepay implements TransferMoney,Balance,Recharge{

    @Override
    public void selectConduct() {
        System.out.println("Choose the contact number");
        Scanner sc=new Scanner(System.in);
        long contact=sc.nextLong();
        tupi();
    }

    @Override
    public void amount() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT");
        int amount =sc.nextInt();
        if(amount>0){
            System.out.println("AMOUNT SUCCUSSFULLY SEND ");
        }
        else{
            System.out.println("enter valid amount");
        }
        checkbalance();
    }

    @Override
    public void selectsim() {
        Scanner sc= new Scanner(System.in);
        System.out.println("SELECT YOUR CHOICE");
        int choice=sc.nextInt();
        System.out.println("press 1:Aritel\npress 2:jio\npress 3:Bsnl\n press 4:vodaphone");
        switch(choice){
            case 1:
                System.out.println("proced to the process through aritel sim");
                System.out.println("press 1: 299/-- with 1.5GB\npress 2:150/-- with 1GB for pack");
                break;
            case 2:
                System.out.println("proced to the process though JIO sim");
                System.out.println("press 1: 200/-- with 1.5GB\npress 2:150/-- with 1.5GB for pack");
                break;
            case 3:
                System.out.println("proced to the process thorugh BSNL sim");
                System.out.println("press 1: 270/-- with 1.5GB\npress 2:180/-- with 1.5GB for pack");
                break;
            case 4:
                System.out.println("proced to the process through Vodaphone");
                System.out.println("press 1: 290/-- with 1.5GB\npress 2:140/-- with 1.5GB for pack");
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
    }

    @Override
    public void tupi() {

        System.out.println("ENTER THE PIN");
        Scanner sc=new Scanner(System.in);
        boolean res=true;
        while(res) {
            int pin = sc.nextInt();
            int count = 0;
            while (pin > 0) {
                count++;
                pin = pin / 10;
            }
            if (count == 4) {
                System.out.println("proced to the next process");

            } else {
                System.out.println("re-enter the pin");
                pin = sc.nextInt();
            }

            amount();

        }
    }
    public void bupi() {

        System.out.println("ENTER THE PIN");
        Scanner sc=new Scanner(System.in);
        boolean res=true;
        while(res) {
            int pin = sc.nextInt();
            int count = 0;
            while (pin > 0) {
                count++;
                pin = pin / 10;
            }
            if (count == 4) {
                System.out.println("proced to the next process");

            } else {
                System.out.println("re-enter the pin");
                pin = sc.nextInt();
            }



        }
    }
    public void rupi() {

        System.out.println("ENTER THE PIN");
        Scanner sc=new Scanner(System.in);
        boolean res=true;
        while(res) {
            int pin = sc.nextInt();
            int count = 0;
            while (pin > 0) {
                count++;
                pin = pin / 10;
            }
            if (count == 4) {
                System.out.println("proced to the next process");
            }
            else {
                System.out.println("re-enter the pin");
                pin = sc.nextInt();
              }

            System.out.println("enetr the amount");
            int amount =sc.nextInt();
            if(amount>0){
                System.out.println("BALANCE IS AVAILABLE");
            }
            else{
                System.out.println("BALANCE NOT AVAILABLE");

            }

        }
    }
    @Override
    public void checkbalance() {
        System.out.println("BALANCE CHECKING PROCESS");
        System.out.println("================================");
        Scanner sc=new Scanner(System.in);
        bupi();



    }
}
class Mainphonepay{
    public static void main(String[] args) {

        TransferMoney t= new phonepay();
        t.selectConduct();
        t.tupi();

        Balance b=new phonepay();
        b.bupi();
        b.checkbalance();
        Recharge r=new phonepay();
        r.selectsim();
        r.rupi();
    }
}
