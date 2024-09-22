//19. Factor of a number
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out the factors of that number");
        int n = sc.nextInt();
        System.out.print("Factors of " + n + " are: 1, ");
        for(int i = 2;i<=n/2;i++){
            if(n%i==0) System.out.print(i + ", ");
        }
        System.out.print(n);
    }
}
