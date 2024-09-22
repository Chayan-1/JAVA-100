//25. Abundant number
/*An abundant number is a number for which the sum of its proper divisors (excluding itself) is greater than the number itself.
Example: 12 is an abundant number because the sum of its divisors (1, 2, 3, 4, 6) is 16, which is greater than 12. */

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out whether the numbr is an Abundant number or not: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i == 0) sum += i;
        }
        if(sum > n) System.out.println(n + " is an Abundant number.");
        else System.out.println(n + " is not an Abundant number.");
        sc.close();
    }
}
