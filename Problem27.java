//27. Highest Common Factor(HCF)

import java.util.Scanner;

public class Problem27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate HCF of those numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y= b;
        while(a != 0)
        {
            int c = b%a;
            b = a;
            a = c;
        }
        System.out.println("HCF of " + x + " and " + y + " is: " + b);
    }
}