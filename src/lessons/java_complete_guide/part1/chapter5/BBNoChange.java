package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BBNoChange {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x: nums) {
            System.out.println("x = " + x);
            x *= 10;
        }
        System.out.println();
        for (int x: nums) {
            System.out.println("x = " + x);
        }
    }
}
