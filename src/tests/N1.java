package tests;

public class N1 {
    public static void main(String[] args) {
        try {
            if (args != null) {
                System.out.printf("Hiii %s", args[0]);
            }
        } catch (Exception exception) {
            System.out.println(". . .");
        }
    }
}