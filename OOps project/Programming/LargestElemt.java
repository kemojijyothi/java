package Programming;

public class LargestElemt {
    public static void main(String[] args) {
        int a[]={6,7,9,13,54,2,34};
        int max=a[0];
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
