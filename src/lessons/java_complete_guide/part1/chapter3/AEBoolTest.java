package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AEBoolTest {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b + " now");
        if (b) {
            b = false;
        }
        if (b) {
            // this won't be executed
        }
        System.out.println("10 > 9 is " + (10 > 9));
    }

}
