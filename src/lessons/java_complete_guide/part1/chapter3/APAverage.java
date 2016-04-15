package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class APAverage {

    public static void main(String[] args) {
        double nums[] = { 10.1, 56.4, 56.123 };
        double result = 0;
        int i;

        for (i = 0; i < 3; i++) {
            result = result + nums[i];
        }
        System.out.println("Average value is " + (result / 3));
    }

}
