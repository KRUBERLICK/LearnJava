package lessons.java_complete_guide.part1.chapter2;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AEBlockTest {

    public static void main(String[] args) {
        int x, y;

        y = 20;
        for (x = 0; x < 10; x++) { // beginning of a code block
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        } // end of a code block
    }

}
