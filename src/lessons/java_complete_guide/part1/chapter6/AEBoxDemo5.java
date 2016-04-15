package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class AEBoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}
