package lessons.java_complete_guide.part1.chapter4;

/**
 * Created by kruberlick on 2/14/16.
 */
public class AEBitLogic {

    public static void main(String[] args) {
        String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f; // & 0x0f is used to reduce the result value to less than 16

        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("c = " + binary[c]);
        System.out.println("d = " + binary[d]);
        System.out.println("e = " + binary[e]);
        System.out.println("f = " + binary[f]);
        System.out.println("g = " + binary[g]);
    }
}
