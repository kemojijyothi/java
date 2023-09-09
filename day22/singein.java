class call{
    public static void normalcall(){
        System.out.println("normal call only available")

    }
}
class videocall extends call{
    public static void vdcall(){
        System.out.println("video call and normal call is available by here");
    }
}
class MainCall{
    publici static void main(String []args){
        videocall v=new videocall();
        System.out.println(v.normalcall());
        System.out.println(v.vdcall());
    }
}