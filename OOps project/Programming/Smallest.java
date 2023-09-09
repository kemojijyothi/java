package Programming;

public class Smallest {
    public static void main(String[] args) {
        int a[]={56,7,3,56,5,65,3,2,3};
        int min=a[0];
        for(int i:a){
            if(i<min){
                min=i;
;            }
        }
        System.out.println(min);
    }
}
