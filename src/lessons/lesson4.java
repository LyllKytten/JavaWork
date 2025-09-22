package lessons;

public class lesson4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println(a + b); // + // a+=b
        System.out.println(a - b); // - // a-=b
        System.out.println(a * b); // * - умножить //a*=b
        System.out.println(a / b); // / - делить //a/=b
        System.out.println(a % b); //a%=b
        // a++ | ++a; a-- | --a; a-=1; a+=1;

        // a++ - прибавляет число после выполнения кода ( блока кода )
        System.out.println(++a);    // a+=1 - a = a + 1
        System.out.println(a++);    // a+=1 - a = a + 1
        System.out.println(a--);    // a-=1 - a = a - 1
        System.out.println(--a);    // a-=1 - a = a - 1

        // && || >= <= > < != ==
        // && - и
        // || - или
        // == - сравнение на равность
        // != - сравнение на НЕравность

        // a==b ? do1 : do2 если a равно b, то выполняется do1, иначе выполняется do2. В основном только в return

        double d = (double)a;

        System.out.println(d);
    }
}
