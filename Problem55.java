//55. Remove all characters from string except alphabets 

import java.util.Scanner;

public class Problem55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to remove all characters except alphabets: ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z') ans += ch;
        }
        System.out.println(str + " after removing all characters except is: " + ans);
    }
}
