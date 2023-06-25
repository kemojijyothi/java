import java.util.*;

class Elseif
{
	public static void main (String[] args)
	{
	    int r;
        int k;
        r = 42;
        k = 32;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }

        r = 78;
        k = 78;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }
	}
}