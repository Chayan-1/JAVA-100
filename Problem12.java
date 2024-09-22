//12. Palindrome number

import java.util.Scanner;

public class Problem12 {
    public static boolean isPalindrome(int n)
    {
        int num = n, rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev==num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPalindrome(n)) System.out.println(n + " is a palindrome Number");
        else System.out.println(n + " is not a Palindrome Number");

        sc.close();
    }
}
