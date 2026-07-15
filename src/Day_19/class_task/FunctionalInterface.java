package Day_19.class_task;

import java.util.function.*;
public class FunctionalInterface {
    public static void main(String[] args) {

        Function<String, Integer> f = (String str) -> Integer.valueOf(str.toUpperCase());
        Function<String, Integer> m = (String str) -> Integer.valueOf(str.toUpperCase());
        System.out.println(f.apply("Shree"));
        System.out.println(m.apply("Saravanan"));
    }
    
}
