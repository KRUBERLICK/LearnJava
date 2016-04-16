package lessons.java_complete_guide.part1.chapter11;

/**
 * Created by kruberlick on 2/23/16.
 */
public class AACurrentThreadDemo {

    public static final int abc = 15;

    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        try {
            String str = "Using the sleep() method.";

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
