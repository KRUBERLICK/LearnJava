package lessons.java_complete_guide.part1.chapter5;

/**
 * Created by kruberlick on 2/20/16.
 */
public class ABSampleSwitch {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than three.");
            }
        }
    }
}
