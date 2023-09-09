package Arraysprograms;



public class MargeArrayForEach {
    public static void main(String[] args) {
        int a[] = {5, 2, 8, 4, 6};
        int b[] = {2, 6, 4, 7, 8, 7};
        int marge[] = avg(a, b);
        for (int i : marge) {
            System.out.println(i);
        }

    }

    public static int[] avg(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int j = 0;
        int k=0;
        for(int i:c){
            if(i<a.length) {
                c[i] = a[j];
                j++;
            }
            else {
                c[i] = a[k];
                k++;
            }

        }

    return c;
    }
}
