//58. Find non-repeating characters in a string 

import java.util.Scanner;

public class Problem58 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to find non repeating characters: ");
        String str = sc.nextLine();
        int n = str.length();
        int[] arr = new int[52];
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z') arr[ch-'A']++;
            else if(ch>='a' && ch<='z') arr[ch-'a'+26]++;
        }
        System.out.println("Non repeating characters in the string " + str + " is: ");

        //to print in alphabetical order
        
        // for(int i=0;i<26;i++)
        // {
        //     char ch = (char)('A' + i);
        //     if(arr[i]==1) System.out.print(ch + " , ");
        // }
        // for(int i=26;i<52;i++)
        // {
        //     char ch = (char)('a' + i - 26);
        //     if(arr[i]==1) System.out.print(ch + " , ");
        // }


        //to print in the input order
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                if(arr[ch-'A']==1) System.out.print(ch + " , ");
            }
            else if(ch>='a' && ch<='z') {
                if(arr[ch-'a'+26]==1) System.out.print(ch + " , ");
            }
        }
    }
}
