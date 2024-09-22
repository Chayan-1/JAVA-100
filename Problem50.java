//50. Check whether a character is a alphabet or not 

import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check whether it is alphabet or not: ");
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) System.out.println(ch + " is an alphabet");
        else System.out.println(ch + " is not an alphabet");
    }
}
