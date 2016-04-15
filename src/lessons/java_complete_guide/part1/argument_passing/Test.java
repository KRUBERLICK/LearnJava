package lessons.java_complete_guide.part1.argument_passing;

public class Test {
    private static void change(Integer a) {
        a = 5;
    }
    private static int fact(int n) {
        int result;
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            System.out.println("Calling fact(" + (n - 1) + ")");
            result = fact(n - 1) * n;
        }
        System.out.println("Returning " + result);
        return result;
    }
    public static void main(String[] args) {
        Init obj = new Init();

        /*Integer i = 45;
        System.out.println("Initial value of i: " + i);
        change(i);
        System.out.println("Value after change() call: " + i);
        System.out.println("\n5 factorial is " + fact(5));*/
    }
}