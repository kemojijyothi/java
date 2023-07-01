//Accesing with static members
class Sample{
    static int i=100;
    public static void Demo(){
        System.out.println(i);
    }
    public static void Display(){
        System.out.println(i);
    }
    public static void main(String []args){
        Demo();//call directly 
        Display();//call directly
    }
}