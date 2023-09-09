package Arraysprograms;

public class SortTheArray {
    public static void main(String[] args) {
        int a[]={5,8,6,2,4,20,1};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
