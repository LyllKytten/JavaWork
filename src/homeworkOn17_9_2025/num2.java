package homeworkOn17_9_2025;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
//        ClassName имяПеременной = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        if (a < 9 && a > 2) {
            System.out.println("Число больше 5 меньше 10");
        } else {
            System.out.println("Неизвестное число");
        }
    }
}