package executerserviceRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=0; i<100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i+1);
            executorService.execute(numberPrinter);
        }
    }

}
