//13. Armstrong number

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n, res = 0, count = 0;

        while(n != 0){
            count++;
            n /= 10;
        }
        n = num;
        while(n != 0){
            int rem = n %10;
            res += Math.pow(rem,count);
            n /= 10;
        }
        if(num==res) System.out.println(num + " is an Armastrong Number");
        else System.out.println(num + " is not an Armastrong Number");
        sc.close();
    }
}
