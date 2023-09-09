package Stringsprograms.com;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int a[]){
       int i=0;
       int j=a.length-1;
       while(i<j){
           int t=a[i];
           a[i]=a[j];
           a[j]=t;
           i++;
           j--;
       }
    }

    public static void main(String[] args) {
        int a[]={5,4,34,23,56,7,76,86};
        System.out.println("Before Reversing the array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        reverse(a);
        System.out.println();
        System.out.println("After Revering the Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
