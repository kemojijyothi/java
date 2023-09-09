//WAP to copy one array to another in the reverse oder
class program5{
    public static void main(String []args){
        int a[]={6,8,9,5,4,8};
        int copy[]=avg(a);
        for(int i:copy){
            System.out.println(i+" ");
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