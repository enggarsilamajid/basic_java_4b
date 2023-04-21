import java.util.Scanner;

public class TennisRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tour = Integer.parseInt(input.nextLine());
        int point = Integer.parseInt(input.nextLine());
        int point0 = 0;
        double percent = 0;
        for (int i = 1; i <= tour; i++) {
            String stage = input.nextLine();
            switch (stage) {
                case "W":
                    point = point+2000;
                    point0 += 2000;
                    percent += 1;
                    break;
                case "F":
                    point = point+1200;
                    point0 += 1200;
                    break;
                case "SF":
                    point = point+720;
                    point0 += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", point);
        System.out.printf("Average points: %d%n", (point0)/tour);
        System.out.printf("%.2f%%", (percent/tour)*100);
    }
}
