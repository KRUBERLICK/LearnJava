package lessons.java_complete_guide.part1.argument_passing;

public class Outer {
    private int x = 15;
    private class Inner {
        private int x; //private or not - it doesn't matter. It will be always visible to Outer
        private void printX() {
            System.out.println("Inner x: " + x);
        }
        public Inner() {
            x = 4;
        }
    }
    private int qq = a();

    Boolean bb = new Boolean("Hello");

    private int a() {
        return 5;
    }

    public void printX() {
        System.out.println("Outer x: " + x);
        Inner inner = new Inner();
        inner.printX();
        int []a = {1,2,3};
        System.out.println(bb);
a:
{

}
    }

    public Inner returnInner() {
        return new Inner();
    }

    public static void main(String ... args) {

    }
}
class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //Outer.Inner a = outer.returnInner(); //it is possible to create an instance of inner class
        //a.printX(); //and even call private method!
        outer.printX();
    }
}