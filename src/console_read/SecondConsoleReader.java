package console_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondConsoleReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("You can input strings...");
        System.out.println("Input word \"stop\" to finish.");

        do {
            s = br.readLine();
            System.out.println(s);
        } while (!s.equals("stop"));
    }
}
