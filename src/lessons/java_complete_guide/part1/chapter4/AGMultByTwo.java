package lessons.java_complete_guide.part1.chapter4;

/**
 * Created by kruberlick on 2/14/16.
 */
public class AGMultByTwo {

    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {

            /*
             * The value can become negative when the leftmost bit is set!
             */
            num = num << 1;

            System.out.println("num = " + num);
            System.out.println("num in binary = " + Integer.toBinaryString(num) + "\n");
        }
    }
}
