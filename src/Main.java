import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput a Name Surname age ang go fuck yourself : ");
        System.out.print("Enter Login: ");
        String login = scanner.next();
        System.out.print("Enter Login: ");
        String password = scanner.next();

        System.out.printf("Login : %s\nPassword : %s", login, password);
    }
}