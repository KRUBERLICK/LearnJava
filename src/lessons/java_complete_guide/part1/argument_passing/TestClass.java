package lessons.java_complete_guide.part1.argument_passing;

public class TestClass {
    enum Type {One, Two, Three}
    enum Apple {
        Johnatan(15.6), RedDevil(5.45), GoldenDel(7.43);
        private double price;

        Apple(double price) { //cannot be public!
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        Type t = Type.One;
        System.out.println(t == Type.Two);
        switch (t) {
            case One:
                System.out.println("One");
                break;
            case Two:
                System.out.println("Two");
                break;
            case Three:
                System.out.println("Three");
                break;
        }
        System.out.println(Apple.GoldenDel.price);
        System.out.println(Apple.RedDevil.ordinal());
        System.out.println(Apple.GoldenDel.compareTo(Apple.Johnatan));
    }
}