//30. Decimal to Binary conversion

import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number to find out the Binary equivalent: ");
        int n = sc.nextInt();
        String ans = "";
        int num = n, rem;
        while(n != 0)
        {
            rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        System.out.println("Binary equivalent of " + num + " is: " + ans);
    }
}
