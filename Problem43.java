//43. Counting Distinct Elements in an Array

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        int count = 0;
        for(Integer val : mp.values()) if(val==1) count++;

        System.out.println("Number of distinct elements in the array is: " + count);
    }
}
