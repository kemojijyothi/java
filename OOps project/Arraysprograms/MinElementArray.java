package Arraysprograms;

import java.util.Scanner;

public class MinElementArray {
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
        int min=arr[0];
        for(int j:arr){
            if(j<min){
                min=j;
            }
        }
        System.out.println("smallet element: "+min);


    }
}
