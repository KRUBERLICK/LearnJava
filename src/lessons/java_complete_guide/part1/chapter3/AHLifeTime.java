package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AHLifeTime {

    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // y will be initialized on each iteration

            System.out.println("y is " + y);
            y = 100;
            System.out.println("y is now " + y);
        }
    }

}
