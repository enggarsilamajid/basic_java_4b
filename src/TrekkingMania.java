import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int group = Integer.parseInt(input.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int sumclimb = 0;
        for (int i = 1; i <= group; i++) {
            int climb = Integer.parseInt(input.nextLine());
            if (climb <= 5) {
                p1 += climb; // mount = "Mount Fuji";
            } else if (climb <= 12) {
                p2 += climb; // mount = "Mount Blanc";
            } else if (climb <= 25) {
                p3 += climb; // mount = "Kilimanjaro";
            } else if (climb <= 40) {
                p4 += climb; // mount = "K2";
            } else if (climb >= 41) {
                p5 += climb; // mount = "Everest";
            }
            sumclimb += climb;
        }
        System.out.printf("%.2f%%%n", p1/sumclimb*100);
        System.out.printf("%.2f%%%n", p2/sumclimb*100);
        System.out.printf("%.2f%%%n", p3/sumclimb*100);
        System.out.printf("%.2f%%%n", p4/sumclimb*100);
        System.out.printf("%.2f%%%n", p5/sumclimb*100);
    }
}
