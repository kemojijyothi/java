//write a program to print the numbers which is divisible by 3 and 4 between 1 t0 100
class DivisibleBy3And4{
    public static void main(String []args){
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%4==0){
                System.out.println(i+" is divisible by both");
            }
            System.out.println(i+" not divisible by both");
            
        }
    }
}