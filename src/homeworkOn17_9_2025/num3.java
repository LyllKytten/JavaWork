package homeworkOn17_9_2025;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a cost: ");
        double a = sc.nextDouble();
        if (a < 100) {
            System.out.println(a*1.05);
        } else if (a <= 200) {
            System.out.println(a*1.07);
        } else {
            System.out.println(a*1.1);
        }
    }
}
