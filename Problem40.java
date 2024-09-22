//40. Sort first half in ascending order and second half in descending 

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr,0,n/2);
        Integer[] temp = new Integer[n - n/2];
        for(int i=n/2;i<n;i++) temp[i-n/2] = arr[i];
        Arrays.sort(temp, Collections.reverseOrder());
        for(int i = n/2;i<n;i++) arr[i] = temp[i-n/2];

        System.out.println("Array after required modification becomes: ");
        for(int i=0;i<n;i++) System.out.print(arr[i] + " ");
    }
}
