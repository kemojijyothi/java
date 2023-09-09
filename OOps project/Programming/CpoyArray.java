package Programming;

public class CpoyArray {

        public static void main(String[] args) {
            int a[]={4,7,9,1,3,6,3};
            int cpy[]=avg(a);
            for(int i:cpy){
                System.out.print(i+" ");
            }
        }
        public static int[] avg(int a[]){
            int c[]=new int[a.length];
            int j=a.length-1;
            for(int i:a){
                c[j]=i;
                j--;
            }

            return c;
        }

    }


