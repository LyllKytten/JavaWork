package lessons;

import java.util.Scanner;

public class classWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte day;
        System.out.println("Enter day: ");
        day = input.nextByte();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        }  else if (day == 4) {
            System.out.println("Thursday");
        }  else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("there is no such day as you request");
        }
    }
}