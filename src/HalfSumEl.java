import java.util.Scanner;

public class HalfSumEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            int newNum = Integer.parseInt(input.nextLine());
            sum += newNum;
            if (newNum > max) {
                max = newNum;
            }
        }
        int sumnomax = sum-max;
        if (sumnomax == max) {
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        } else {
            int diff = Math.abs(max-sumnomax);
            System.out.println("No");
            System.out.println("Diff = "+diff);
        }
    }
}
