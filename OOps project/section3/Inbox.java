package section3;

public interface Inbox {
    void receivethemai();
    void forwardmain();
}
 interface combox{
    void sendmail();
}

class Gmail implements Inbox,combox{

    @Override
    public void receivethemai() {
        System.out.println("Receiving the mail from client");
    }

    @Override
    public void forwardmain() {
        System.out.println("Forward the mail from others");
    }

    @Override
    public void sendmail() {
        System.out.println("send the mail from others");
    }
}
class MainGmail{
    public static void main(String[] args) {
        Inbox i=new Gmail();
        i.forwardmain();
        i.receivethemai();
        combox c=new Gmail();
        c.sendmail();

    }
}
