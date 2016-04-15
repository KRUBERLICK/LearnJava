package generics_examples;


class Gen<T> {
    private T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    String showType() {
        return ob.getClass().getName();
    }
}

class A {
    private double value = 15.6;

    double getValue() {
        return value;
    }
}

class GenArr<T extends Number> {
    private T[] arr;

    GenArr(T[] arr) {
        //arr = new T[size]; error!
        this.arr = arr;
    }

    double average() {
        double sum = 0;
        for (T el : arr) {
            sum += el.doubleValue();
        }
        sum /= arr.length;
        return sum;
    }
    boolean isTheSameAverage(GenArr<?> ob) {
        return this.average() == ob.average();
    }
}

/**
 * Created by kruberlick on 4/14/16.
 */
public class GetTest {

    public static void main(String[] args) {
        Gen<Integer> ob1 = new Gen<>(45);
        Gen<String> ob2 = new Gen<>("Hello");

        System.out.println("Type of ob1 is " + ob1.showType());
        System.out.println("Type of ob2 is " + ob2.showType());
        System.out.println("Value of ob1 is " + ob1.getOb());
        System.out.println("Value of ob2 is " + ob2.getOb());

        Gen<A> ob3 = new Gen<>(new A());

        System.out.println("Type of ob3 is " + ob3.showType());
        System.out.println("Value of ob3 is " + ob3.getOb().getValue());

        GenArr<Integer> arr1 = new GenArr<>(new Integer[]{1, 2, 3, 4, 5});
        GenArr<Integer> arr2 = new GenArr<>(new Integer[]{1, 2, 3, 4, 5});
        GenArr<Double> arr3 = new GenArr<>(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0});

        System.out.println("arr1 average is " + arr1.average());
        System.out.println("arr2 average is " + arr2.average());
        System.out.println("arr3 average is " + arr3.average());
        if (arr1.isTheSameAverage(arr2)) {
            System.out.println("arr1 has the same avg as arr2");
        } else {
            System.out.println("averages of arr1 and arr2 are not the same");
        }
        if (arr2.isTheSameAverage(arr3)) {
            System.out.println("arr2 has the same avg as arr3");
        } else {
            System.out.println("averages of arr2 and arr3 are not the same");
        }
        if (arr1.isTheSameAverage(arr3)) {
            System.out.println("arr1 has the same avg as arr3");
        } else {
            System.out.println("averages of arr1 and arr3 are not the same");
        }
    }
}
