//61. Replacing a particular word with another word in a string

import java.util.Scanner;

public class Problem61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to replace a word: ");
        String str = sc.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String sub = sc.nextLine();
        System.out.println("Enter the word with which the replacement should be done: ");
        String replace = sc.nextLine();
        String modified = str.replace(sub, replace);
        System.out.println(str + " after modification is: " + modified);
    }  
}
