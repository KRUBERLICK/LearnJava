package generics_examples;

interface MyInt {
    public int i = 5;
    public int result(int i, int g);
    public abstract int resulttt();
}

class AmbTest<T extends Number, V extends Number> {
    T ob1;
    V ob2;
    AmbTest(T ob1) {
        this.ob1 = ob1;
        this.ob2 = (V)ob1;
    }
    AmbTest(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    static public void main(String[] args) {

    }
}

public class AnotherGen {
    public static void main(String[] args) {
        AmbTest<Integer, Double> obj1 = new AmbTest<>(56);

        System.out.println(obj1.ob1);
        System.out.println(obj1.ob2);

        //AmbTest<Integer, Double> obj2 = new AmbTest<>(45.7);
        //System.out.println(obj2.ob1);
        //System.out.println(obj2.ob2);

        Integer i = new Integer("10");
        System.out.println(i.toString() == i.toString());

        String xxx = 12 + "a";

        byte aaa = 5;
        byte b = 0;
    }
}
