package Programming;

public class SecondSmallest {
    public static void main(String[] args) {
        int a[]={12,45,74,25,15,48,13};
        int min=a[0];

        for(int i:a){
            if(i<min){
                min=i;
            }
        }
        int min2=a[0];
        for(int i:a){
            if(i<min2 && i!=min){
                min2=i;
            }
        }
        System.out.println(min2);

    }
}
