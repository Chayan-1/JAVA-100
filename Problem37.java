//37. Find Second Smallest Element in an Array 

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int s = arr[0], ss = 1000000;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<s){
                ss = s;
                s = arr[i];
            }
            else if(arr[i]<ss)
            {
                ss = arr[i];
            }
        }
        System.out.println("Second smallest element in the array is: " + ss);
    }
}
