package lessons.java_complete_guide.part1.argument_passing;

public class Init {
    private static int a = 5; //1
    private static int b;
    private int c = 15; //3
    private int d;
    private final int e = 78;

    static { //2
        System.out.println("Inside static block");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Initializing b");
        b = 66;
        System.out.println("b = " + b);
    }

    public Init() { //4
        System.out.println("Inside constructor");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Initializing d");
        d = 56;
        System.out.println("d = " + d);
    }
}
