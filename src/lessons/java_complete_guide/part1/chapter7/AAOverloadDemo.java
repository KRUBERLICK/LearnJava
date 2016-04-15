package lessons.java_complete_guide.part1.chapter7;

/**
 * Created by kruberlick on 3/16/16.
 */
public class AAOverloadDemo {

    void test() {
        System.out.println("No parameters");
    }


    void test(int a) {
        System.out.println("a: " + a);
    }


    void test(int a, int b) {
        System.out.println(String.format("a: %d\nb: %d", a, b));
    }

    double test(double d) {
        System.out.println("d: " + d);
        return d * d;

    }
}
