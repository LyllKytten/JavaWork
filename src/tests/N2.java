package tests;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
