//11. Reverse of a number 

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, rem, num = n;
        while(n != 0){
            rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        System.out.println("Reverse of number " + num + " is " + rev);
        sc.close();
    }
}
