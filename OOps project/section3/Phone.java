package section3;

public class Phone {
    void call(){
        System.out.println("IN phone normal call only passible");
    }
    void msg(){
        System.out.println("in phone msg is availabe");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
}
class smartphone extends Phone implements Camera,MusicPlayer{
    void videocall(){
        System.out.println("in smart phone video call also available");
    }

    @Override
    public void click() {
        System.out.println("in camera you can take picture ");
    }

    @Override
    public void record() {
        System.out.println("in smart phone picture with recoring aslo passible");
    }

    @Override
    public void play() {
        System.out.println("in smart phone music is is availble");
    }

    @Override
    public void pause() {
        System.out.println("you can pasuse the music");
    }
}
class MainPhone{
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.click();
        s.pause();
        s.play();
        s.record();
        s.msg();
        s.videocall();
    }
}
