package OOPSConcept;

import java.util.Scanner;


class Bank
{
    private long accountnumber;
    private int balance;
    private int phonenumber;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ACCOUNT NUMBER:");
        long accountnumber=sc.nextLong();
        int count=0;
        while(accountnumber>0)
        {
            count++;
            accountnumber=accountnumber/10;
        }
        if(count==12)
        {
            System.out.println("CONTINUE TO PROSED");
        }
        else
        {
           System.out.println("IT IS NOT VALID MEMMEBER"); 
        }
    }
    public long getAcoountnumber()
     {
        return accountnumber;
    }
    public void setAcoountnumber(long accountnumber) 
    {    
        this.accountnumber = accountnumber;
        } 
    
    public int getBalance()
     {
        return balance;
    }
    public void setBalance(int balance) 
    {
        this.balance = balance;
    }
    public int getPhonenumber() 
    {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
