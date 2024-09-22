//64. Find the “Kth” max and min element of an array

import java.util.Arrays;
import java.util.Scanner;

public class Problem64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Enter the value of k to find kth maximum and minimum: ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int mini = arr[k-1];
        int maxi = arr[n-k];
        System.out.println(k + "th mamximum is: " + maxi + " and " + k +"th minimum is: " + mini);
    }
}
