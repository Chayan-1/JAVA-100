//60. Replace a sub-string in a string: 

import java.util.Scanner;

public class Problem60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to replace a sub-string: ");
        String str = sc.nextLine();
        System.out.println("Enter the sub-string to be replaced: ");
        String sub = sc.nextLine();
        System.out.println("Enter the string with which the replacement should be done: ");
        String replace = sc.nextLine();
        String modified = str.replaceAll(sub, replace);
        System.out.println(str + " after modification is: " + modified);
    }  
}
