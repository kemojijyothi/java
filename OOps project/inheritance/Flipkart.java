package inheritance;

public class Flipkart {
    String productName;
    int productprice=60000;
    String productColor="red";
    public void search(String productName){
        this.productName=productName;
        System.out.println("SEARCH FOR THE PRODUCT NAME");
    }
}
class flipkartAddToCart extends Flipkart{
    public void placeToOrder(){
        System.out.println("product name ="+productName +"\n"+"PLACE THE ORDER  ");
    }
}
class flipkartorder extends flipkartAddToCart{
    public void AddToCart(){
        System.out.println("product name = "+productName+"\n"+"product color = "+productColor+"\n"+"product price = "+productprice+"\n"+"successfuuly order place the order");
    }
}
class MainFlipkart{
    public static void main(String[] args) {
        flipkartorder f=new flipkartorder();
        f.search("moto");
        f.placeToOrder();
        f.AddToCart();

    }
}

