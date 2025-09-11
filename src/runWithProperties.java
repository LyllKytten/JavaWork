import java.util.*;

public class runWithProperties {
    public static void main(String[] args) {
        boolean withProps = false;
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
            withProps = true; //work only for linux
        }

        if (withProps) {
            System.out.print("Program runned without any props");
        } else {
            System.out.print("Program runned with any props");
        }
    }
}