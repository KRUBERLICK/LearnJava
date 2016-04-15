package lessons.java_complete_guide.part1.chapter2;

/**
 * Created by kruberlick on 2/9/16.
 */
public class ACIfSample {

    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x is now equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x is now greater than y");
        }

        /*
         * This won't display anything
         */
        if (x == y) {
            System.out.println("This won't be displayed");
        }
    }

}
