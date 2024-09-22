//26. Friendly pair
/*Input : n = 6, m = 28
Output : Yes
Explanation:
Divisor of 6 are 1, 2, 3, 6.
Divisor of 28 are 1, 2, 4, 7, 14, 28.
Sum of divisor of 6 and 28 are 12 and 56
respectively. Abundancy index of 6 and 28 
are 2. So they are friendly pair.

Input : n = 18, m = 26
Output : No */

import java.util.Scanner;

public class Problem25 {
    static int sumOfDivisors(int n)
    {
        int sum = 0;
        for(int i=1;i<=n/2;i++) if(n%i==0) sum += i;
        return sum + n; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to check whether they are friendly pair or not: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = sumOfDivisors(a);
        int sum2 = sumOfDivisors(b);
        double abundancy1 = (double)sum1 / a;
        double abundancy2 = (double)sum2 / b;
        if(abundancy1 == abundancy2) System.out.println(a + " and " + b + " are friendly pair.");
        else System.out.println(a + " and " + b + " are not friendly pair.");
    }
}
