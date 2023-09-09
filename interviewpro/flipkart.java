class flipkart{
    flipkart(){
        System.out.println("open flipkart");
    }
    flipkart(int productname){
        this(20.6);
        System.out.println("productname:"+productname);
    }
    flipkart(double price){
        this("white");
        System.out.println("productprice:"+price);
    }
    flipkart(char size){
        this();
        System.out.println("size of product:"+size);
    }
    flipkart(String color){
        this('m');
        System.out.println("color of the product"+color);
    }
    flipkart(String m,int quality){
        this("note book");
        System.out.println("how many product:"+quality);
    }
    public static void main(String []args){

        flipkart f=new flipkart(10);
    }
}