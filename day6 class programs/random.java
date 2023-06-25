class random{
    public static void main(String [] args)
    {
        int a=10,b=20,c=30;
        System.out.println(a++ + --b + b-- + c+2 - c++);//50
        System.out.println(c++ + --c - b++ - b+5 - a++);//19

    }
}