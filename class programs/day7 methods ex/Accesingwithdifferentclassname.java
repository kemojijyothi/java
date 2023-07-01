//Accesing with different class name
class Sample1{
    static int i=90;
    public static void Display(){
        System.out.println(i);
        i=100;
        System.out.println(i);
    }

}
class Demo
{
     static int j=290;
    public static void wish(){
        System.out.println(Sample.i);

    }
    public static void main(String []args){
        System.out.println(j);
        Sample1.Display();
        wish();
    
}
}
