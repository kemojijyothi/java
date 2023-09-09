//wap to find the average of the given array element
class program4{
    public static void main(String []args){
        int a[]={4,6,4,5,6,7,8,9};
        double ans=avg(a);
        System.out.println(ans);      
    }
    public static double avg(int a[]){
        double sum=0;
        for(int i:a){
            sum=sum+i;
        }
        double s=sum/a.length;
        return s;
    }
}