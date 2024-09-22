//32. Calculate the area of a circle :

import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle to calculate the area of that circle: ");
        Double r = sc.nextDouble();
        Double area = 3.14*r*r;
        System.out.println("Area of the circle of radius " + r + " is: " + area);
    }
}
