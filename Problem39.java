//39. Reversing a Number

import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it: ");
        int n = sc.nextInt();
        int num = n, rev = 0;
        while(n != 0)
        {
            rev = rev*10 + n%10;
            n /= 10;
        }
        System.out.println("Reverse of " + num + " is: " + rev);
    }
}
