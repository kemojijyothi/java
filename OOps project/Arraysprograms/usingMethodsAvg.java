package Arraysprograms;

public class usingMethodsAvg {
    public static void main(String[] args) {
        int a[]={5,8,3,6,4,7,9};
        double c=avg(a);
        System.out.println(c);
    }
    public static double avg(int a[]){
        double sum=0;
        for(int i:a){
            sum=sum+i;
        }
       double s=sum/a.length;
        return s;
    }

}
