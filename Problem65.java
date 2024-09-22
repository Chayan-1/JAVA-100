//65. Move all the negative elements to one side of the array

import java.util.Scanner;

public class Problem65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<0) count++;
        }
        int[] ans = new int[n];
        int pos = count, neg = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0) ans[neg++] = arr[i];
            else ans[pos++] = arr[i];
        }
        System.out.println("Array after moving all the negative elements to the beginning: ");
        for(int x : ans) System.out.print(x + " ");
    }
}
