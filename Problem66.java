//66. Find the Union and Intersection of the two sorted arrays. 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the first sorted array: ");
        for(int i=0;i<n;i++) arr1[i] = sc.nextInt();
        System.out.println("Enter the elements of the second sorted array: ");
        for(int i=0;i<m;i++) arr2[i] = sc.nextInt();
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;
        while(i<n && j<m){
            while(i>0 && i<n && arr1[i] == arr1[i-1]) i++;
            while(j>0 && j<m && arr2[j] == arr2[j-1]) j++;
            if(arr1[i]==arr2[j]){
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]<arr2[j]){
                union.add(arr1[i]);
                i++;
            }
            else{
                union.add(arr2[j]);
                j++;
            }
        }
        while(i<n){
            while(i>0 && i<n && arr1[i] == arr1[i-1]) i++;
            union.add(arr1[i]);
            i++;
        }
        while(j<m){
            while(j>0 && j<n && arr2[j] == arr2[j-1]) j++;
            union.add(arr1[j]);
            j++;
        }

        System.out.println("Union of the two arrays is: ");
        System.out.println(union);
        System.out.println("Imtersection of the two arrays is: ");
        System.out.println(intersection);
    }
}
