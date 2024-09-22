//16. Find the Nth Term of the Fibonacci Series 

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find out the nth term of the fibonacci series: ");
        int n = sc.nextInt();
        int a = 1, b = 1;
        for(int i=3;i<=n;i++){
            int c = a+b;
            a = b;
            b = c; 
        }
        System.out.println(n + "th term of the fibonacci series is : " + b);
    }
}
