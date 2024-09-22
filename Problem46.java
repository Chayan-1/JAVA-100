//46. Counting the number of even and odd elements in an array

import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int even = 0, odd = 0;
        for(int x : arr){
            if(x%2==0) even++;
            else odd++;
        }
        System.out.println(even + " even elements and " + odd + " odd elements are present in the array.");
    }
}
