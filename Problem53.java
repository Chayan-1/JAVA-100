//53. Remove spaces from a string :

import java.util.Scanner;

public class Problem53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove its spaces: ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ') ans += str.charAt(i);
        }
        System.out.println(str + " after removing spaces: " + ans);
    }
}
