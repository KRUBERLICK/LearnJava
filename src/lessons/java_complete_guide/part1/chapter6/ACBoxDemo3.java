package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class ACBoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        mybox1.volume();
        mybox2.volume();
    }
}
