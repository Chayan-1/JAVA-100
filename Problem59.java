//59. Check if two strings are Anagram or not

import java.util.Scanner;

public class Problem59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string to check whether they are anagram or not: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        int[] arr = new int[52];
        for(int i=0;i<n1;i++)
        {
            char ch = str1.charAt(i);
            if(ch>='A' && ch<='Z') arr[ch-'A']++;
            else if(ch>='a' && ch<='z') arr[ch-'a'+26]++;
        }
        for(int i=0;i<n2;i++)
        {
            char ch = str2.charAt(i);
            if(ch>='A' && ch<='Z') arr[ch-'A']--;
            else if(ch>='a' && ch<='z') arr[ch-'a'+26]--;
        }
        int i = 0;
        for(;i<52;i++) if(arr[i] != 0) break;
        if(i==52) System.out.println(str1 + " and " + str2 +" are anagram.");
        else System.out.println(str1 + " and " + str2 +" are not anagram.");
    }
}
