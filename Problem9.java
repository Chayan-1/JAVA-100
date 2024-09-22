//9. Prime number within a given range

import java.util.Scanner;

public class Problem9 {
    static boolean isPrime(int n)
    {
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0 || n==1) return false;
        for(int i = 5;i*i<=n;i++)
        {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range and upper range.");
        int l = sc.nextInt();
        int h = sc.nextInt();
        
        System.out.println("Prime Numbers in the range " + l + " and " + h + " are: ");
        for(int i=l;i<=h;i++)
        {
            if(isPrime(i)) System.out.print(i + " ");
            //else System.out.println(i + " is not a prime number.");
        }
        sc.close();
    }
}
