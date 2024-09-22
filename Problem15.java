//15. Fibonacci Series upto nth term 

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper range of the series");
        int n = sc.nextInt();
        System.out.println("Fibonacci series upto " + n +"th term is: ");
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=3;i<=n;i++){
            int c = a+b;
            a = b;
            b = c; 
            System.out.print(c + " ");
        }
    }
}
