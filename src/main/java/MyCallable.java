import java.util.*;
import java.util.concurrent.*;

public class MyCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Set<Callable<String>> c = new HashSet<Callable<String>>();

        c.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable Task1";
            }

        });

        c.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable Task2";
            }

        });

        List<Future<String>> l = exec.invokeAll(c);
        for(Future<String> f: l)
            System.out.println(f.get());


        exec.shutdown();


    }

}
