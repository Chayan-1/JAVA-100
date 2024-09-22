//33. Power of a Number

import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and its index to calculate the power of that number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=y;i++) {
            ans *= x;
        }
        System.out.println(x + " to the power " + y + " is: " + ans);
    }
}
