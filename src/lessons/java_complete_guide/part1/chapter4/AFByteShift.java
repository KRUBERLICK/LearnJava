package lessons.java_complete_guide.part1.chapter4;

/**
 * Created by kruberlick on 2/14/16.
 */
public class AFByteShift {

    public static void main(String[] args) {
        byte a = 64;
        byte b;
        int i;

        i = a << 2;

        /*
         * Byte is promoted to int first, only then it'll be shifted
         */
        b = (byte)(a << 2);

        System.out.println("Original value of a is " + Integer.toBinaryString(a));
        System.out.println("i and b: " + Integer.toBinaryString(i) + " " + Integer.toBinaryString(b));
        System.out.println("i = " + (i & 0x0f)); // masking the i value to byte
    }
}
