import java.util.Locale;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class runWithProperties {
    public static Integer[] addNumber(Integer[] arr, int x) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static void arrayTest() {
        Integer[] arr = {1, 2, 3};

        arr = addNumber(arr, 4);

        System.out.println(Arrays.toString(arr));
    }

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