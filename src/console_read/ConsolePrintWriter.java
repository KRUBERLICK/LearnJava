package console_read;

import java.io.PrintWriter;

public class ConsolePrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Hello!");
    }
}
