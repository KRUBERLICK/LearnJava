package annotations_test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

    String str() default "Default";
    int val() default 0;
}

@MyAnno(str = "Class annotation", val = 56)
public class Meta {

    @MyAnno(str = "Constructor annotation", val = 100)
    public Meta() {

        try {
            System.out.println(Meta.class.getConstructor().getAnnotation(MyAnno.class).str());
            System.out.println(Meta.class.getAnnotation(MyAnno.class).str());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @MyAnno(str = "Second constructor", val = 5)
    public Meta(int a) {

        try {
            System.out.println(Meta.class.getConstructor(int.class).getAnnotation(MyAnno.class).str());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @MyAnno(str = "Hello world!", val = 15)
    public static void myMeth() {

        Meta ob = new Meta();
        Meta ob1 = new Meta(4);

        try {
            System.out.println(Meta.class.getMethod("myMeth").getAnnotation(MyAnno.class).str() + " "
                    + ob.getClass().getMethod("myMeth").getAnnotation(MyAnno.class).val());
        } catch (NoSuchMethodException e) {
            System.out.println("Cannot find the method");
        }
    }

    @MyAnno(str = "Two parameters", val = 20)
    public static void myMeth(String a, int b) {

        try {
            System.out.println(Meta.class.getMethod("myMeth", String.class, int.class).
                    getAnnotation(MyAnno.class).str() + " " + Meta.class.getMethod("myMeth", String.class,
                    int.class).getAnnotation(MyAnno.class).val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        myMeth();
        myMeth("a", 5);
    }
}
