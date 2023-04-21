import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());
        double wprice = Double.parseDouble(input.nextLine());
        int tprice = Integer.parseInt(input.nextLine());
        double amoney = 0;
        int toy = 0;
        double totmoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i%2 == 0) {
                amoney += (i*5);
            } else {
                toy += 1;
            }
        }
        totmoney = amoney+(toy*tprice)-((age/2)*1);
        if (totmoney>=wprice) {
            System.out.printf("Yes! %.2f", (totmoney-wprice));
        } else {
            System.out.printf("No! %.2f", (wprice-totmoney));
        }
    }
}
