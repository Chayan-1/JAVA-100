//21. Strong number
/* A number is called a strong number if the sum of the factorials of its digits is equal to the number itself.
Example: 145 is a strong number because 
1!+4!+5!=1+24+120=145. */

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is a strong number or not: ");
        int n = sc.nextInt();

        int num = n, res = 0;
        while(n != 0){
            int rem = n % 10;
            int f = 1;
            for(int i=rem;i>0;i--) f *= i;
            res += f;
            n /= 10;
        }
        if(num == res) System.out.println(num + " is a Strong Number.");
        else System.out.println(num + " is not a Strong Number.");
    }
}
