//10. Sum of digits of a number

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to get the sum of its digits");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0)
        {
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
