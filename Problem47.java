//47. Find maximum product sub-array in a given array

import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int prod = 1, maxi = 1, curr = 1;
        for(int x : arr)
        {
            curr = Math.max(curr*x, x);
            maxi = Math.max(maxi, curr);
        }
        System.out.println("Maximum product of sub-array is: " + maxi);
    }
}
