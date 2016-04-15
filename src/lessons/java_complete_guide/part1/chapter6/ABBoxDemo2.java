package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class ABBoxDemo2 {
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
        // each object has it's own instance variables
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("mybox1 volume is " + vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("mybox2 volume is " + vol);
    }
}
