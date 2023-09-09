package objectclass;

public class Mobile {

    String company;
    String color;
    double price;
    Mobile(String company,String color,double price){
        this.company=company;
        this.color=color;
        this.price=price;
    }
    public static void main(String[] args) {
        Mobile m=new Mobile("Motoepower","blue",60000);
        Mobile m1=new Mobile("vivo","blue",60000);
        Mobile m2=new Mobile("Motoepower","blue",60000);
        boolean res=m.equals(m1);
        if(res){
            System.out.println("both objects are same");
        }
        else{
            System.out.println("both objects are different");
        }
        boolean res1=m.equals(m2);
        if(res1){
            System.out.println("both the objeacts are same for mto m2");
        }
        else{
            System.out.println("both the objects are different");
        }
    } @Override
    public boolean equals(Object obj){
    Mobile m1=(Mobile) obj;
     boolean b=company.equals(m1.company)&&color.equals(m1.color)&&price==m1.price;
    return b;
}

}
