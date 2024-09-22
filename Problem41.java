//41. Finding the frequency of elements in an array

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem41{
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
        System.out.println("Frequency of all the elements of the array is: ");
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        sc.close();
    }
}