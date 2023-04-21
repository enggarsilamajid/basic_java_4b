import java.util.Scanner;

public class Oscar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String acname = input.nextLine();
        double apoint = Double.parseDouble(input.nextLine());
        int num = Integer.parseInt(input.nextLine());
        for (int i = 1; i<=num; i++) {
            if (apoint < 1250.5) {
                String evname = input.nextLine();
                int evleng = evname.length();
                double epoint = Double.parseDouble(input.nextLine());
                apoint = apoint+(evleng*epoint)/2;
            }
        }
        if (apoint >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", acname, apoint);
        } else {
            double diff = 1250.5-apoint;
            System.out.printf("Sorry, %s you need %.1f more!", acname, diff);
        }
    }
}
