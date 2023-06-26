//pass no arg return value
class PassNoArgReturnValue{
    public static int demo(){
        System.out.println("main starts");
        return (20);
    }
    public static void main(String []args){
        System.out.println("main starts");
      
      System.out.println(demo());
      demo();
    }
}