package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BLBreakErr {

    public static void main(String[] args) {
        one: for (int i = 0; i < 10; i++) {
            System.out.print("Pass " + i + ": ");
        }
        for (int j = 0; j < 10; j++) {
            if (j == 10) {
                //break one; // WRONG!
            }
            System.out.print(j + " ");
        }
    }
}
