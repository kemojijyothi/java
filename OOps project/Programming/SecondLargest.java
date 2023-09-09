package Programming;

public class SecondLargest {
    public static void main(String[] args) {
        int a[]={12,17,19,9,25,15};
        int max=a[0];
        int max2=0;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }

        for(int j:a){
            if(j>max2 && j!=max){
                max2=j;
            }
        }
        System.out.println(max2);
    }
}
