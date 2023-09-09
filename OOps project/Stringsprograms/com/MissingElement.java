package Stringsprograms.com;

public class MissingElement {
    public static void main(String[] args) {
        int a[]={4,2,7,8,5,3};
        for(int i:a){
            System.out.print(a[i]+" ");
        }
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of the elements"+sum1);
        int sum2=0;
        for(int i=1;i<8;i++){
           sum2=sum2+i;
        }
        int missingelemt=sum1-sum2;
        System.out.println("Misiing elemts from the above string is"+missingelemt);

    }
}
