//Sum of First N Natural numbers

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = n*(n+1)/2;
        System.out.println("Sum of first "+ n +" natural numbers is " + result); 
    }
}
