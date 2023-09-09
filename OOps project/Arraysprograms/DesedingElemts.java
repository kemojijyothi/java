package Arraysprograms;

public class DesedingElemts {
    public static void main(String[] args) {
        int a[]={7,9,8,3,6,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Desending order :");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
