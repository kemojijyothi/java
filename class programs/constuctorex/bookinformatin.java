//create a class book and store 5 informatilon and display 5 difference book details
class BookInformation{
    String name;
    String authorname;
    int edition;
    int price;
    static String bookstore="skv store";
    BookInformation(String bname,String bAuthorname,int bedition,int bprice){
         name=bname;
         authorname=bAuthorname;
         edition=bedition;
         price=bprice;
    }
    public static void main(String []args){
        System.out.println("BOOK NUMBER 1");
        BookInformation b1=new BookInformation("The Adventures of Huckleberry Finn","Mark Twins",2,500);
        System.out.println("Book name:"+b1.name+"\n"+"Book Authorname:"+b1.authorname+"\n"+"Book edition :"+b1.edition+"\n"+"Book price :"+b1.price+"\n"+"bookstore name is"+bookstore);
        System.out.println();
        System.out.println("BOOK NUMBER 2");
        BookInformation b2=new BookInformation("Nineteen Eightly-Four","George Orawell",2,1500);
        System.out.println("Book name:"+b2.name+"\n"+"Book Authorname:"+b2.authorname+"\n"+"Book edition :"+b2.edition+"\n"+"Book price :"+b2.price+"\n"+"the book store name is"+bookstore);
        System.out.println();
        System.out.println("BOOK NUMBER 3");
        BookInformation b3=new BookInformation("pride and Prejudice","jane Austen",7,900);
        System.out.println("Book name:"+b3.name+"\n"+"Book Authorname:"+b3.authorname+"\n"+"Book edition :"+b3.edition+"\n"+"Book price :"+b3.price+"\n"+"book stoore name is:"+bookstore);
        System.out.println();
        System.out.println("BOOK NUMBER 4");
        BookInformation b4=new BookInformation("Jane Eyre","Charlotte Bronte",4,2500);
        System.out.println("Book name:"+b4.name+"\n"+"Book Authorname:"+b4.authorname+"\n"+"Book edition :"+b4.edition+"\n"+"Book price :"+b4.price+"\n"+"book stoore name is:"+bookstore);
        System.out.println();
        System.out.println("BOOK NUMBER 5");
        BookInformation b5=new BookInformation("Emma","Jane Astue",5,900);
        System.out.println("Book name:"+b5.name+"\n"+"Book Authorname:"+b5.authorname+"\n"+"Book edition :"+b5.edition+"\n"+"Book price :"+b5.price+"\n"+"book stoore name is:"+bookstore);

    }



}