package lessons.java_complete_guide.part1.chapter6;

/**
 * Created by kruberlick on 2/29/16.
 */
public class AHStack {
    int stck[] = new int[10];
    int tos;

    AHStack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}
