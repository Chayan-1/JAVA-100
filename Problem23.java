//23. Automorphic number
/*A number is called automorphic if its square ends in the same digits as the number itself.
Example: 25 is an automorphic number because 25^2 =625, and 25 is the last two digits of 625. */
import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is an automorphic number or not: ");
        int n = sc.nextInt();
        int sq = n*n, num = n;
        while(n!=0){
            if(n%10 != sq%10) break;
            n /= 10;
            sq /= 10;
        }
        if(n==0) System.out.println(num + " is an automorphic number.");
        else System.out.println(num + " is not an automorphic number.");
    }
}
