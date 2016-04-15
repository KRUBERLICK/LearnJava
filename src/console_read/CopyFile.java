package console_read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough parameters!");
            return;
        }
        int i;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);
            do {
                i = in.read();
                if (i != -1) {
                    out.write(i);
                }
            } while (i != -1);
        } catch (IOException e1) {
            System.out.println("I/O Exception");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("I/O Exception");
            }
            try {
                if (out  != null) {
                    out.close();
                }
            } catch (IOException e1) {
                System.out.println("I/O Exception");
            }
        }
        System.out.println("Copy finished");
    }
}
