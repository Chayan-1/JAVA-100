//18. Power of a number

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and power respectively to find out the power: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=y;i++){
            ans *= x;
        }
        System.out.println(x + "to the power " + y + " is: " + ans);
    }
}
