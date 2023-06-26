//pass arg return value
class PassArguReturnValu{
    public static int wish(int i,int j){
        System.out.println("main starts");
        System.out.println(i);
        System.out.println(j);
        return (10);
     }
    public static void main(String []args){
        System.out.println("main ends");
        wish(20,30);
        System.out.println(wish(30,60));

    }
}