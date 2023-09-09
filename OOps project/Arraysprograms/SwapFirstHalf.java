package Arraysprograms;

public class SwapFirstHalf {
    public static void main(String[] args) {
        int a[]={8,1,5,3,2,7,4,6};
        int mid=a.length/2;
        for(int i=0;i<mid;i++){
            int temp=a[i];
            a[i]=a[mid+i];
            a[mid+i]=temp;

        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
