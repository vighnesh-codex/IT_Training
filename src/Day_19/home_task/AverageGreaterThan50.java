package Day_19.home_task;

import java.util.Arrays;

public class AverageGreaterThan50 {
    public static void main(String[] args) {

        int[] arr = {25, 60, 80, 40, 90, 55, 30, 100};

        double avg = Arrays.stream(arr)
                .filter(n -> n > 50)
                .average()
                .getAsDouble();

        System.out.println(avg);
    }
}