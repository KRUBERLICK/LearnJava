package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class ADBoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}
