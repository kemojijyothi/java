//WAP to print the product of odd number from 15 to 25
class ProductOfOddNumbers{
    public static void main(String []args){
        int product=1;
        for(int i=15;i<=25;i++){
            if(i%2!=0){
                product*=i;
            }
        }
        System.out.println(product);
    }
}