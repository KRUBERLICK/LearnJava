package console_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] file = new String[100];

        for (int i = 0; i < file.length; i++) {
            file[i] = br.readLine();
            if (file[i].equals("stop")) {
                break;
            }
        }

        System.out.println("\nHere's your file:");
        for (String el : file) {
            if (el.equals("stop")) {
                break;
            }
            System.out.println(el);
        }
    }
}
