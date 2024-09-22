//63. Given an array which consists of only 0, 1 and 2. Sort the array without using any  algorithm

import java.util.Scanner;

public class Problem63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int zero=0, one=0, two=0;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]==0) zero++;
            else if(arr[i]==1) one++;
            else two++;
        }
        for(int i=0;i<zero;i++) arr[i] = 0;
        for(int i=zero;i<zero+one;i++) arr[i] = 1;
        for(int i=zero+one;i<n;i++) arr[i] = 2;

        System.out.println("Array after sorting is: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
