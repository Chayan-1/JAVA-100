//Sum of numbers in a given range

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower and upper range respectively");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = (b*(b+1)/2) - (a*(a-1)/2);
        System.out.println("Sum of numbers from "+ a +" to " + b + " is "+ res); 
    }
}
