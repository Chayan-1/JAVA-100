//14. Armstrong number in a given range

import java.util.Scanner;

public class Problem14 {
    static boolean isArmstrong(int n)
    {
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
        return num==res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and upper range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Armstrong Numbers in the range between " + a + " and " + b + " is: ");
        for(int i=a;i<=b;i++){
            if(isArmstrong(i)) System.out.print(i + " ");
        }
        sc.close();
    }
}
