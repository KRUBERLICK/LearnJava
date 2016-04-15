package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AGScope {

    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            x = y * 2;
        }
        // y = 100; Error! y is not known here!
        System.out.println("x is " + x); // but x is still known here
    }

}
