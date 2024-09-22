//8. Prime number

import java.util.Scanner;

public class Problem8 {
    static boolean isPrime(int n)
    {
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0 || n==1) return false;
        for(int i = 5;i*i<=n;i+=6)
        {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is prime or not: ");
        int n = sc.nextInt();

        if(isPrime(n)) System.out.println(n + " is a Prime number.");
        else System.out.println(n + " is not a Prime number.");
        sc.close();
    }
}
