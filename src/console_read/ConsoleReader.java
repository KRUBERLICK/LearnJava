package console_read;

import java.io.*;

public class ConsoleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;

        do {
            ch = (char)br.read();

            System.out.println(ch);
        } while (ch != 'q');
    }
}
