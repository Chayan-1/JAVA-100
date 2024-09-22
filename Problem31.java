//31. Can a number be expressed as a sum of two prime numbers 

import java.util.Scanner;

public class Problem31 {
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
        System.out.println("Enter a number to check whether a number can be expressed as the sum of two prime numbers: ");
        int n = sc.nextInt();
        int x=0,y=0;
        for(int i = 2;i<n/2;i++)
        {
            if(isPrime(i) && isPrime(n-i)) {
                x = i;
                y = n-i;
                break;
            }
        }
        if(x==0 && y==0) System.out.println(n + " can not be expressed as the sum of two prime numbers.");
        else System.out.println(n + " can be expressed as the sum of two prime numbers: " + x + " and " + y);
    }
}
