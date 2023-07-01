//pass arguments return no value
class PassArguReturnNoValue{
    public static void display(int i,int j){
        System.out.println("in dispaly method");
        System.out.println(i);
        System.out.println(j);
        

    }
    public static void main(String []args){
        System.out.println("main strait");
        display(10,20);
        System.out.println("main ends");
        
    }
}