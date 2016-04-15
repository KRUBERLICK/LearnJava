package console_read;

public class ConsoleWriteDemo {
    public static void main(String[] args) {
        int ch = 'a';
        char ch2 = 'b';

        System.out.write(ch);
        System.out.write('\n'); //end of line is mandatory! There won't be any output without it!

        System.out.write(ch2);
        System.out.write('\n');
    }
}
