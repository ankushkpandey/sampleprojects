package executerserviceandcallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
         // add two number and multiply 100 after result come
        ExecutorService executorService = Executors.newCachedThreadPool();

        MathematicalOperation mo = new MathematicalOperation(2,100);

        Future<Integer> myFutureResult = executorService.submit(mo);

        Integer myResult = myFutureResult.get();

        System.out.println("Result from parallel thread " + myResult );

        System.out.println("Multiplying 100 in result " + myResult * 100);

    }
}
