package Stringsprograms.com;


    import java.util.Scanner;
    public class Array
    {
        public static void main (String [] args)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter array size");
            int n=scan.nextInt();
            int[] a=new int[n];
            System.out.println("enter array element");


            for(int i=0;i<=n;i++)
            {
                int ele=scan.nextInt();
                if(ele<0)
                {
                    a[i]=ele;
                }
                else
                {
                    try
                    {
                        throw new PositiveNumberException();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                }
            }

        }
    }

