package Programming;

public class Reverse {
    public static void main(String[] args) {
        int a[]={4,7,9,1,3,6,3};
        int cpy[]=avg(a);
        for(int i:cpy){
            System.out.print(i+" ");
        }
    }
    public static int[] avg(int a[]){
        int c[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            c[j]=a[i];
            j++;
        }
        return c;
    }

}
