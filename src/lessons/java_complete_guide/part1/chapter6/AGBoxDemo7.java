package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class AGBoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}
