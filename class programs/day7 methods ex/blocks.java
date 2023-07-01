//blocks
class staticblocks{
    static int i=200;
    static{
        System.out.println("statci block");
      System.out.println(i);
      {
        System.out.println(" static inner block");
        i=300;
        System.out.println(i);
      }   
    }
    {
    System.out.println("Non static  block");
    {
        int j=600;
        System.out.println("non static innerblock");
        System.out.println(j);
    }
    }

    public static int Display(int i,String s){
        System.out.println(i);
        System.out.println(s);
        
        return i;
    }
    public static void main(String []args){
        Display(20,"java");
        staticblocks sb=new staticblocks();
        
        System.out.println("hello");
    }
}