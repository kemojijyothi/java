package section3;

public interface Colleagedata {
    void hallticketnum();
    void marks();
}
interface hosteldata{
    void stuprofile();
}
class Student1 implements Colleagedata,hosteldata{

    @Override
    public void hallticketnum() {
        System.out.println("halltiket prsent in college data");
    }

    @Override
    public void marks() {
        System.out.println(" marks crds provide the college");
    }

    @Override
    public void stuprofile() {
        System.out.println("student profile and fee recipt present in hst");
    }

}
class MainStudent{
    public static void main(String[] args) {
        Colleagedata c=new Student1();
        c.hallticketnum();;
        c.marks();
        hosteldata h=new Student1();
        h.stuprofile();

    }
}

