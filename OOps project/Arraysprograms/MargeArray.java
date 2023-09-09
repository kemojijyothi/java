package Arraysprograms;

public class MargeArray {
    public static void main(String[] args) {
        int a[]={3,6,4,5,6};
        int b[]={6,8,7,3,6,3};
        int marge[]=avg(a,b);
        for(int i:marge){
            System.out.print(i+" ");
        }
    }
    public static int[] avg(int a[],int b[]){
        int c[]=new int[a.length+b.length];
        int j=0;
        for(int i=0;i<a.length+b.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else {
                c[i]=b[j];
                j++;
            }
        }
        return c;
    }

}
