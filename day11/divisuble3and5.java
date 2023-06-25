//WAP to print the number which is divisible by 3 and 5 between 1 to 100
class Divisibe3And5{
    public static void main(String []args){
        for(int i=3;i<100;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i+" is divisible by both");
            }
            System.out.println(i+ " is not divisible by both");
        }
    }
}