package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class AOForVar {

    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done;) {
            System.out.println("i is " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
