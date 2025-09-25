import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int workNum = num;
        String revNum = "";
        while (workNum > 0) {
            revNum += workNum % 10;
            workNum/=10;
        }
        int revNumI = Integer.parseInt(revNum);
        System.out.println(revNumI);
        if (num == revNumI) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}