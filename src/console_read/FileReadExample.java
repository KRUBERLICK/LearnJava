package console_read;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) throws IOException {
        FileInputStream file;
        int i;

        if (args.length < 1) {
            System.out.println("File name not specified!");
            return;
        }
        file = new FileInputStream(args[0]);

        do {
            i = file.read();
            if (i != -1) {
                System.out.print((char)i);
            }
        } while (i != -1);

        file.close();
    }
}
