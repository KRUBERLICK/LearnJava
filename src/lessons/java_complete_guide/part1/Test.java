package lessons.java_complete_guide.part1;

import java.util.ArrayList;

public class Test {
    private static void qs(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int x = a[(left + right) / 2];
        do {
            while (a[i] < x && i < right) {
                i++;
            }
            while (x < a[j] && j > left) {
                j--;
            }
            if (i <= j) {
                int buf = a[i];
                a[i] = a[j];
                a[j] = buf;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) {
            qs(a, left, j);
        }
        if (right > i) {
            qs(a, i, right);
        }
    }

    private static int sumResult = 0;

    private static void sumRecur(int[] a, int left, int right) {
        if (Math.abs(left - right) == 1) {
            sumResult += a[left] + a[right];
            return;
        }
        int mid = left + (right - left) / 2;
        sumRecur(a, left, mid);
        sumRecur(a, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1 };
    Integer sum = new Integer(0);

        sumRecur(a, 0, a.length - 1);

        //test(sum);

        System.out.println(sumResult);
    }
}
