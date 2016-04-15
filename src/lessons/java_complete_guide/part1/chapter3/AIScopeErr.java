package lessons.java_complete_guide.part1.chapter3;

/**
 * Created by kruberlick on 2/9/16.
 */
public class AIScopeErr {

    public static void main(String[] args) {
        int bar = 1;

        {
            // int bar = 2; Error! There is an already declared variable bar in outer scope!
        }
    }

}
