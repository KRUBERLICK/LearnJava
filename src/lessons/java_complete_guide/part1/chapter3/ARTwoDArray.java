package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class ARTwoDArray {

    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
                k++;
            }
            System.out.println();
        }
    }

}
