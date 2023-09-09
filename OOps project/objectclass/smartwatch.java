package objectclass;

public class smartwatch {
    String model;
    String company;
    double price;

    public smartwatch(String model, String company, double price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public static void main(String[] args) {
        smartwatch s=new smartwatch("abc","d1",8000);
        smartwatch s1=new smartwatch("abc","d1",6000);
        smartwatch s2=new smartwatch("abc","d1",8000);
        boolean res=s.equals(s1);
        if(res){
            System.out.println("s and s1 having the same features");
        }
        else{
            System.out.println("s and having different objects");
        }
        boolean res1=s.equals(s2);
        if(res1){
            System.out.println("s and s2 having same features ");
        }
        else{
            System.out.println("s and s2 having different features");
        }
    }
    @Override
    public boolean equals(Object obj){
        smartwatch s=(smartwatch) obj;//downcasting
        boolean b=company.equals(s.company)&&model.equals(s.model)&&price==s.price;

       return b;
    }

}
