
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();

        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            // populating the deque with a new random integer in each iteration
            int randomValue = random.nextInt(100000000);
            integerDeque.add(randomValue);
        }

        // Logging the starting time for iteration
        long startTime = System.currentTimeMillis();

        // Iterating through the deque and printing each element
        for (Integer intValue : integerDeque) {
            System.out.println(intValue);
        }

        for (int i = 0; i < integerDeque.size(); i++) {
            System.out.println(integerDeque.poll());
        }

        System.out.println("Size hote: >> " + integerDeque.size());

        // Logging the ending time for iteration
        long endTime = System.currentTimeMillis();
//        Time taken to iterate through 1 million integers: 19656 milliseconds

        // Calculating and logging the elapsed time for iteration
        long totalTime = endTime - startTime;
        System.out.println("Time taken to iterate through 1 million integers: " + totalTime + " milliseconds");
    }
}
