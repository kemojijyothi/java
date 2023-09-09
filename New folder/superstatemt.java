class parent2{
    parent2(char r){
        System.out.println("it is a parent classs");
    }
}
class child2 extends parent2{
    child2(double b)
    {
        super('j');
        System.out.println("it child class");
    }
    public static void main(String []args){
        child2 c=new child2(7.8);
    }
}