//28. Lowest Common Multiple (LCM)

import java.util.Scanner;

public class Problem28 {
    static int gcd(int a, int b)
    {
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find out LCM of those numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a*b)/gcd(a,b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
