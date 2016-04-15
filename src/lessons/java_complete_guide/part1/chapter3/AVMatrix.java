package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/10/16.
 */
public class AVMatrix {

    public static void main(String[] args) {
        double m[][] = {
                {1, 2, 3, 4},
                {1 * 2, 1 * 8, 5, 3},
                {6, 3, 8, 3},
                {1, 8, 3, 5}
        };
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
