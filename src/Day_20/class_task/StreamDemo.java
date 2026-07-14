package Day_20.class_task;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream stream = Stream.of("Stream 1");
        stream.forEach(System.out::println);
        
    }
}