package ConsumerPackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CallableExample {
    public static int[] intarray = IntStream.rangeClosed(0,5000).toArray();
    public static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException {
        Callable callable1 = () ->{
            int sum = 0;
            for (int i : intarray) {
                sum += i;
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Callable<Integer>> taskList = Arrays.asList(callable1);
        List<Future<Integer>> results = executorService.invokeAll(taskList);
    }
}
