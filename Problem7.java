//7. Leap year or not

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Enter an year to check whether the year is leap year or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%400==0 || (n%100!=0 && n%4==0)){
            System.out.println(n + " is a leap year.");
        }
        else{
            System.out.println(n + " is not a leap year.");
        }
        sc.close();
    }
}
