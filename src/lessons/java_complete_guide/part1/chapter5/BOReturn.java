package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BOReturn {

    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return.");
        if (t) {
            return;
        }
        System.out.println("This won't be executed");
    }
}
