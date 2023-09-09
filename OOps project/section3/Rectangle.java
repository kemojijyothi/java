package section3;

public class Rectangle {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        if(length>0)
            length=length;
        else
            length=0;
    }

    public int getBredth() {
        return bredth;
    }

    public void setBredth(int bredth) {
        this.bredth = bredth;
        if(bredth>0)
            bredth=bredth;
        else
            bredth=0;
    }

    private int bredth;
}
class Mainrectane
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(-10);
        r.setBredth(20);
        System.out.println(r.getLength());
        System.out.println(r.getBredth());

    }
}
