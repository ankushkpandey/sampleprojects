package scheduleexecuter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Hello");
        }, 0,5, TimeUnit.SECONDS);

        try{
            Thread.sleep(20000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();



    }
}
