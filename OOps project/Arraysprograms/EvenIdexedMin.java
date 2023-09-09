package Arraysprograms;

import java.util.Scanner;

public class EvenIdexedMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENTS INTO THE ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("ARRAY ELEMENTS ARE:");
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
        int sum = 0;
        for (int k = 0; k < n; k++) {
           if(arr[k]%2==0){
               int min=arr[k];
               if(min>arr[k+1]){
                   min=arr[k+1];
               }
               System.out.println(min);
           }




        }

    }
}
