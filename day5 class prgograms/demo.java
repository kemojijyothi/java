class demo{

    public static void main(String [] args){
        java.util.Scanner scan=new java.util.Scanner(System.in);//with out importing import statement we can use java.util scanner class
        System.out.println("enter the value for a:");//enter any user input a is ex:20
        int a =scan.nextInt();
        System.out.println("enter the vslue for b:");//enter any user input b is ex:40
        int b=scan.nextInt();
        int results=a+b;//adding the a and b values ex:20+40=60 it can store variable as reults
        System.out.println("addtional of a and b is:"+results);//output:addition of a and b is:60
        
    }
}