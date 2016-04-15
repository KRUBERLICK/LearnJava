package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BJBreakLoopFor {

    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            System.out.print("i = " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer;
                }
                System.out.print(j + " ");
            }
            System.out.println("This won't print");
        }
        System.out.println("Loops complete.");
    }
}
