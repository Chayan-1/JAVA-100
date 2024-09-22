//20. Finding Prime Factors of a number

import java.util.Scanner;

public class Problem20 {
    static boolean isPrime(int n)
    {
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out the prime factors of that number: ");
        int n = sc.nextInt();
        System.out.println("Prime factors of number " + n + " are: ");
        for(int i = 2;i<=n;i++)
        {
            if(n%i==0 && isPrime(i)) System.out.print(i + ",");
        }
    }
}
