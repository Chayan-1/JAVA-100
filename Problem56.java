//56. Capitalize the first and last character of each word of a string

import java.util.Scanner;

public class Problem56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String ans = "";
        int n = str.length();
        for(int i=0;i<n;i++)
        { 
            if(i==0 || i==n-1 || str.charAt(i-1)==' ' || str.charAt(i+1)==' ') 
                ans += Character.toUpperCase(str.charAt(i));
            else ans += str.charAt(i);
        }
        System.out.println(str + " after capitilising first and last character of the word is : " + ans);
    }
}
