//45. Removing Duplicate elements from an array 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(!ans.contains(arr[i])) ans.add(arr[i]);
        }

        System.out.println(ans);
    }
}
