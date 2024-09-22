//24. Harshad number
/*A Harshad number is a number that is divisible by the sum of its digits.
Example: 18 is a Harshad number because the sum of the digits of 18 is 1+8=9, and 18 is divisible by 9. */

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is harshad number or not: ");
        int n = sc.nextInt();
        int sum = 0, num = n;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        if(num%sum == 0) System.out.println(num + " is a Harshad number");
        else System.out.println(num + " is not a Harshad number");
    }
}
