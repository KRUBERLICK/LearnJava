package console_read;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
    static int a;

    public static void main(String[] args) {
        ShowFile ff = new ShowFile();
        ff.a = 5;
        String asd = "a";
        Integer ii = new Integer(10);
        if (ii.toString().intern() == ii.toString().intern()) {
            System.out.println("asdasdasdasdasdasd");
        }
        if (args.length != 1) {
            System.out.println("Usage: ShowFile FileName");
            return;
        }
        try (FileInputStream file = new FileInputStream(args[0])) {
            int i;
            do {
                i = file.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
