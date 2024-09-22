//6. Greatest of the Three numbers

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find out greatest among them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a + " is greatest among three");
            else System.out.println(c + " is greatest among three");
        }
        else{
            if(b>c) System.out.println(b + " is greatest among three");
            else System.out.println(c + " is greatest among three");
        }
    }
}
