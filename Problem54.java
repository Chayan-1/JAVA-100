//54. Count the sum of numbers in a string

import java.util.Scanner;

public class Problem54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to count the sum of the numbers: ");
        String str = sc.nextLine();
        int sum = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9') sum += (ch-'0');
        }
        System.out.println("Sum of all the numbers present in the string " + str + " is: " + sum);
    }
}
