package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AMConversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion from int to byte:");
        b = (byte)i; // b = i % 256 !!
        System.out.println("i and b: " + i + " " + b);
        System.out.println("\nConversion from double to int:");
        i = (int)d;
        System.out.println("d and i: " + d + " " + i);
        System.out.println("\nConversion from double to byte:");
        b = (byte)d;
        System.out.println("d and b: " + d + " " + b);
    }

}
