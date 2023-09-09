package section3;

import java.util.Scanner;

public class Flipkart {
    String productname;
    int productpric;

    public void search() {
        System.out.println("ENTER THE PRODUCTNAME");
        Scanner sc=new Scanner(System.in);
        String productname=sc.next();
        //System.out.println("ENTER THE PRODUCTNAME");
        System.out.println("searching product :" + productname);
    }
}
    class FlipkartAddTokart extends Flipkart
    {
        public void productAddedtocart(){
            System.out.println("ENTER THE PODUCTPRICE");
            Scanner sc=new Scanner(System.in);
            int  productprice=sc.nextInt();
            //System.out.println("ENTER THE PODUCTPRICE");
            System.out.println("searching product :" + productprice);
        }
    }
    class Flipkartorder extends FlipkartAddTokart
    {
        public void placeoder(){

            System.out.println("place a order");
        }
    }

class MainFlipkart
{
    public static void main(String[] args)
    {

        Flipkartorder f = new Flipkartorder();
        f.search();
        f.productAddedtocart();
        f.placeoder();
    }
}


