package lessons.java_complete_guide.part1.chapter4;

/**
 * Created by kruberlick on 2/14/16.
 */
public class ADIncDec {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
