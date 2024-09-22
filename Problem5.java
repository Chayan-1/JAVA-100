
import java.util.Scanner;

//5. Greatest of two numbers

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to check the greatest among them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) System.out.println(a + " is greater than " + b);
        else if(a<b) System.out.println(b + " is greater than " + a);
        else System.out.println("Both are equal to " + a);
    }
}
