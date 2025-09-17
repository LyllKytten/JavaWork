package useableFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class arrayAddObj {
    public static Integer[] addInt(Integer[] arr, int x) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static String[] addStr(String[] arr, String x) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static Float[] addF(Float[] arr, float x) {
        List<Float> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static Double[] addD(Double[] arr, double x) {
        List<Double> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }


    public static void arrayTest() {
        Integer[] arr = {1, 2, 3};

        arr = addInt(arr, 4);

        System.out.println(Arrays.toString(arr));
    }
}
