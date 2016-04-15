package generics_examples;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        System.out.println(isIn(2, nums));
        System.out.println(isIn(6, nums));

        String[] strs = {"one", "two", "three"};

        System.out.println(isIn("one", strs));
        System.out.println(isIn("four", strs));
    }
}