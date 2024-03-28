package numberprinterthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es2 = Executors.newFixedThreadPool(10);

        for(int i=0; i<100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i+1);
            //Thread thread = new Thread(numberPrinter);
            //thread.start();
            if(i%2 ==0){
                es2.execute(numberPrinter);
            }else{
                es.execute(numberPrinter);
            }

        }
    }
}
