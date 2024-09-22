//49. Check whether a character is a vowel or consonant 

import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character to check whether it is vowel or consonent: ");
        char input = sc.next().charAt(0);
        char ch = Character.toLowerCase(input);
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') System.out.println(input + " is a vowel");
        else System.out.println(input + " is a consonent");
    }
}
