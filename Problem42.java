//42. Sorting elements of an array by frequency 
//Not able to do it

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem42 {
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

    }
}
