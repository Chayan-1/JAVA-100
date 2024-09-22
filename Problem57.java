//57. Calculate frequency of characters in a string

import java.util.Scanner;

public class Problem57 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        int[] arr = new int[52];
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z') arr[ch-'A']++;
            else if(ch>='a' && ch<='z') arr[ch-'a'+26]++;
        }
        System.out.println("Frequency of the characters present in the string is: ");
        for(int i=0;i<26;i++)
        {
            char ch = (char)('A' + i);
            if(arr[i]>0) System.out.println(ch + " : " + arr[i]);
        }
        for(int i=26;i<52;i++)
        {
            char ch = (char)('a' + i - 26);
            if(arr[i]>0) System.out.println(ch + " : " + arr[i]);
        }
    }
}
