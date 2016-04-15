package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class AHDoWhile {

    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick" + n);
        } while(--n > 0);
    }
}
