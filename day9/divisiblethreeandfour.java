//write a program to print the number which is divisible by 3 and 4 between 1 to 100
class DivisibleByThreeAndFour
{
    public static void main(String [] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0&&i%4==0)
            {
                System.out.println(i);
            }
        }
    }
}