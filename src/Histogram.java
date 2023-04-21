import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i=1; i<=n; i++) {
            int current = Integer.parseInt(input.nextLine());
            if (current<200) {
                p1 += 1;
            } else if (current <400) {
                p2 += 1;
            } else if (current <600) {
                p3 += 1;
            } else if (current <800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        System.out.printf("%.2f%%%n", (double) p1/n*100);
        System.out.printf("%.2f%%%n", (double) p2/n*100);
        System.out.printf("%.2f%%%n", (double) p3/n*100);
        System.out.printf("%.2f%%%n", (double) p4/n*100);
        System.out.printf("%.2f%%%n", (double) p5/n*100);
    }
}
