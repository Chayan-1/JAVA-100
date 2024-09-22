//38. Find Second Largest Element in an Array 

import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int l = arr[0], sl = -1000000;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }
            else if(arr[i]>sl)
            {
                sl = arr[i];
            }
        }
        System.out.println("Second smallest element in the array is: " + sl);
    }
}
