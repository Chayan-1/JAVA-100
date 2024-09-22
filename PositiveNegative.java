//Positive or Negative number

import java.util.*;

class PositiveNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether a number is positive or not : ");
        int n = sc.nextInt();
        if(n<0) System.out.println("Negative Number");
        else System.out.println("Positive number");
        sc.close();
    }
}