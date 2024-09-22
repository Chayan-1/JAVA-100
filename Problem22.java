//22. Perfect number
/*A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
Example: 6 is a perfect number because the divisors of 6 (excluding 6) are 1, 2, and 3, and 1+2+3=6. */

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is a perfect number or not: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum += i;
        }
        if(sum==n) System.out.println(n + " is a Perfect Number");
        else System.out.println(n + " is not a Perfect Number");
    }
}
