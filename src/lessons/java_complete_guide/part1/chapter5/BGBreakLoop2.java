package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BGBreakLoop2 {

    public static void main(String[] args) {
        int i = 0;

        while(i < 100) {
            if (i == 10) {
                break;
            }
            i++;
            System.out.println("i = " + i);
        }
        System.out.println("Loop complete.");
    }
}
