package Programming;

public class leftshif {
    public static void main(String[] args) {
        int a[]={12,17,9,19,25,15};
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[1]=a[i];
        }
        a[a.length-1]=temp;
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
