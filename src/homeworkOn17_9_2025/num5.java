package homeworkOn17_9_2025;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start money: ");
        float money = sc.nextFloat();
        System.out.print("Enter cnt of month: ");
        int month = sc.nextInt();

        for (int i = 0; i < month; i++) {
            money*=1.07f;
        }

        System.out.printf("finall cnt of money: %f", money);
    }
}