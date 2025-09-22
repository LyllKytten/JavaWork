package lessons;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("line1"); // asdasd
        System.out.println("line2"); // asdasd

        String s = "variable";
        System.out.printf("Hi %s", s); // %s - String %d - int

        System.out.print("line1 " + s + " assdadasd");
        System.out.print("line2");

        System.out.println("\nLine1\n    Line2"); // \n

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputFromUser = input.next(); //next() - String //nextInt() - int
        System.out.printf("Your string : %s", inputFromUser);
    }
}