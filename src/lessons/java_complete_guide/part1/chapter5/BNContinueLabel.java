package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BNContinueLabel {

    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
