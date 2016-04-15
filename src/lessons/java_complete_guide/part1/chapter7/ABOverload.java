package lessons.java_complete_guide.part1.chapter7;

/**
 * Created by kruberlick on 3/16/16.
 */
public class ABOverload {


    public static void main(String[] args) {
        AAOverloadDemo ob = new AAOverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 10);
        result = ob.test(5.);
        System.out.println("Result is " + result);
    }
}
