package section3;
//super and this call statements
public class ParentClass {
    ParentClass() {
        this(6);
        System.out.println(" hello parent class");
    }

    ParentClass(int i) {
        System.out.println(" hello int type parent class");
    }
}
    class childclass1 extends ParentClass {
         childclass1() {
            this(5.6);
            System.out.println(" hllo duble type");
        }
        childclass1(double d){
             super();
            System.out.println(" doube type");
    }

        public static void main(String[] args) {
            childclass1 cc=new childclass1();
        }

}

