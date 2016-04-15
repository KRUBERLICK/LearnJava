package generics_examples;

public interface MinMax<T extends Comparable<T>> {

    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    MyClass(T[] ob) {
        vals = ob;
    }

    public T min() {
        T v = vals[0];

        for (T val : vals) {
            if (val.compareTo(v) < 0) {
                v = val;
            }
        }

        return v;
    }

    public T max() {
        T v = vals[0];

        for (T val : vals) {
            if (val.compareTo(v) > 0) {
                v = val;
            }
        }

        return v;
    }
}

class GenIfDemo {

    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chr[] = {'a', 'z', 'q', 'p'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> ioc = new MyClass<>(chr);

        System.out.println("Min value of inums: " + iob.min());
        System.out.println("Max value of inums: " + iob.max());
        System.out.println("\nMin value of chr: " + ioc.min());
        System.out.println("Max value of chr: " + ioc.max());
    }
}