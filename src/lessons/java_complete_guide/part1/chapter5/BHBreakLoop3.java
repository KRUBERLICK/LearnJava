package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class BHBreakLoop3 {

    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) break; // terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
