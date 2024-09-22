//68. Kadane’s Algorithm 

import java.util.Scanner;

public class Problem68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int curr = 0, maxi = 0;
        for(int i=0;i<n;i++)
        {
            curr = Math.max(curr+arr[i], arr[i]);
            maxi = Math.max(maxi, curr);
        }
        System.out.println("Largest sum of contiguos subarray is: " + maxi);
    }
}
