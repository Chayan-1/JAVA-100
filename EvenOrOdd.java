//Even or Odd number

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int n = sc.nextInt();

        if(n%2==0) System.out.println(n + " is an even number");
        else System.out.println(n + " is an odd number");
    }
}
