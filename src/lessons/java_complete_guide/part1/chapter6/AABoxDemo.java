package lessons.java_complete_guide.part1.chapter6;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box object.");
        width = height = depth = 0;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

/**
 * Created by kruberlick on 2/23/16.
 */
public class AABoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.height = 10;
        myBox.width = 20;
        myBox.depth = 15;
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("vol = " + vol);
    }
}
