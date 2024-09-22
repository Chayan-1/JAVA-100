//29. Binary to Decimal to conversion

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a binary number to convert it into decimal equivalent: ");
        int n = sc.nextInt();
        int ans = 0, mf = 1, num = n;
        while(n != 0)
        {
            int rem = n % 10;
            ans += rem*mf;
            mf *= 2;
            n /= 10;
        }
        System.out.println("Binary equivalent of " + num + " is " + ans);
    }
}
