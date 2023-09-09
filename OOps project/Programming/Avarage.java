package Programming;

public class Avarage {
    public static void main(String[] args) {
        int a[]={4,7,1,9,8,7,5};
        double ans=avg(a);
        System.out.println(ans);
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

