package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BAForEach2 {

    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x: nums) {
            System.out.println("value is " + x);
            sum += x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
