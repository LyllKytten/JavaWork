package useableFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayAddObj {


    public static Integer[] addNumberInt(Integer[] arr, int x) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static String[] addNumberStr(String[] arr, String x) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static Float[] addNumberF(Float[] arr, float x) {
        List<Float> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }

    public static Double[] addNumberD(Double[] arr, double x) {
        List<Double> list = new ArrayList<>(Arrays.asList(arr));

        list.add(x);

        return list.toArray(arr);
    }


    public static void arrayTest() {
        Integer[] arr = {1, 2, 3};

        arr = addNumberInt(arr, 4);

        System.out.println(Arrays.toString(arr));
    }
}
