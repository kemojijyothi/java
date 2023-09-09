package Stringsprograms.com;

public class pro {
    public static void main(String[] args) {
        int a[]={4,6,3,7,9,2};
        int max=a[0];
        int max2=0;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        for(int j:a)
        {
            if(j>max2 &j!=max)
            max2=j;
        }
        System.out.println(max2);
    }
}
