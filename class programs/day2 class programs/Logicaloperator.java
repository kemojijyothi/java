class Logicaloperatorsextends
{
    public static void main(String [] args){
        int a=10;
        int b=100;
        boolean results;
        results=!((a>=b)||(b==a))&&((false&&false)||(true&&true));
        System.out.println(results);
    }
}