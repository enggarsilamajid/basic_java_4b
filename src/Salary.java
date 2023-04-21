import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sal = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++) {
            if (sal > 0) {
            String tab = input.nextLine();
                switch (tab) {
                    case "Facebook":
                        sal -= 150;
                        break;
                    case "Instagram":
                        sal -= 100;
                        break;
                    case "Reddit":
                        sal -= 50;
                        break;
                }
            }
        }
        if (sal <= 0) {
            System.out.println("You have lost your salary.");
        } else
            System.out.println(sal);
    }
}