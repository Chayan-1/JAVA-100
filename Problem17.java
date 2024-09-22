//17. Factorial of a number

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out the factorial of the number: ");
        int n = sc.nextInt();
        if(n==0) {
            System.out.println("factorial of 0 is: 1");
            return;
        }
        int ans = 1;
        for(int i=1;i<=n;i++) ans *= i;
        System.out.println("factorial of " + n + " is: " + ans);
    }
}
