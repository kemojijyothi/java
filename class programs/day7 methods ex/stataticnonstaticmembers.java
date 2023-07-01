class StaticMethod {
    int i=300;
    public void Display(){
        System.out.println(i);
    }
    public static void sample(){
        
      StaticMethod sm=new StaticMethod(); 
        System.out.println(sm.i);

    }
    public static void main(String []args){
        System.out.println("main method");
         StaticMethod sm=new StaticMethod();
        sm.Display();
        sample();
    }

}