//51. Check if the given string is Palindrome or not

import java.util.Scanner;

public class Problem51 {
    static boolean isPalindrome(String str)
    {
        int l = 0, r = str.length()-1;
        while(l<r)
        {
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether the string is palindrome or not: ");
        String str = sc.next();
        if(isPalindrome(str)) System.out.println(str + " is a palindrome string.");
        else System.out.println(str + " is not a palindrome string");

    }
}
