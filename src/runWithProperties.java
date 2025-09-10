import java.util.*;

public class runWithProperties {
    public static void main(String[] args) {
        boolean withError = false;
        try {
            if (args != null) {
                for (String obj : args) {
                    if (obj.equals("gitler")) {
                        System.out.println("priver Egor");
                    }
                    if (obj.equals("--help")) {
                        System.out.println("this is HELPER with your stupid brain");
                    }
                }
            }
        } catch (Exception error) {
            withError = true;
        }
    }
}