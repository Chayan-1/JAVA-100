//48. Finding equilibrium index of an array 

import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, l_sum = 0;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int i;
        for(i=0;i<n;i++){
            if(l_sum == sum-arr[i]) break;
            else {
                l_sum += arr[i];
                sum -= arr[i];
            }
        }     
        if(i==n) System.out.println("There is no equilibrium point in the array.");
        else System.out.println("Equilibrium point of the array is at the index: " + i);

    }
}
