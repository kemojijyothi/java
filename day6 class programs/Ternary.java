class Ternary{
    public static void main(String [] args){
        int a=10,b=20;
        String m;
        System.out.println("First number is:"+a);
        System.out.println("First number is:"+b);
        m=a>b?"hello":"good morning";//if the conditions is true statemnt one executed .if statement is false statement two is executed.
        System.out.println(m);
        int n=a>b?(a-b):(a+b);
        System.out.println(n);
        
    }
}