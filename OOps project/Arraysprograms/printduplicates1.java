package Arraysprograms;

public class printduplicates1 {
    public static void main(String[] args) {
        int a[]={4,6,5,3,2,4,3,5,6};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                    b[j] = -1;
                }
            }
            if (b[i] != -1) {
                b[i] = count;
            }

        }
        for(int i=0;i<a.length;i++){
            if(b[i]==-1){
                System.out.println(a[i]+" ");
            }
        }
    }
}
