//36. Smallest element in an array

import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int smallest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<smallest) smallest = arr[i];
        }
        System.out.println("Largest element of the array is: " + smallest);
    }
}
