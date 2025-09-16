package homeworkOn17_9_2025;

public class num4 {
    public static void main(String[] args) {
        int xyz = 10000000;
        int born = 14;
        int bornOnPpl = 1000;
        int death = 8;
        for (int i = 0; i < 10; i++) {
//            int k = xyz/bornOnPpl;
//            xyz+=k*14;
//            xyz-=death;
            xyz = xyz + (xyz/bornOnPpl*born) - death;
        }
        System.out.println(xyz);
    }
}
