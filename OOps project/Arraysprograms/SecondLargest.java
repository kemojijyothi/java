package Arraysprograms;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE ELEMTS INTO THE ARRAY :");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Array elemets are:");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
        int max=arr[0];
        int max2=0;
        for(int j:arr){
            if(j>max){
                max=j;
            }
        }
        for(int j:arr){
            if(j>max2&&j!=max){
                max2=j;
            }
        }
        System.out.println("smallet element: "+max2);

    }
}
