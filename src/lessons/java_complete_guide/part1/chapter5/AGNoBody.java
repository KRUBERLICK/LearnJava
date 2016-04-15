package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class AGNoBody {

    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        while(++i < --j);
        System.out.println("Midpoint is " + i);
    }
}
