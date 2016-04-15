package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BIBreak {

    public static void main(String[] args) {
        boolean p = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if (p) {
                        break second;
                    }
                    System.out.println("This won't be executed.");
                }
            }
            System.out.println("After second block.");
        }
    }
}
