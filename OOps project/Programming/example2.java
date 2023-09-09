package Programming;

public class example2 {
    public static void main(String[] args) {
        int a[]={6,5,3,6,2,3,4};
        int b[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    b[j]=-1;
                }
            }
            if(b[i]!=1){
                b[i]=count;
            }
        }
        for(int i=0;i<a.length;i++){
            if(b[i]==-1){
                System.out.println(a[i]+" ");
            }
        }
    }
}
