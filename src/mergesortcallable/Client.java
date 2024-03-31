package mergesortcallable;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args)  throws Exception{
        ExecutorService es = Executors.newCachedThreadPool();

        List<Integer> unsortedList = List.of(7,5,9,15,25,28,1,94,2);

        Sorter sorter = new Sorter(unsortedList, es);

        Future<List<Integer>> futureSortedList = es.submit(sorter);

        List<Integer> sortedList = futureSortedList.get();

        for (Integer in: sortedList) {
            System.out.println(in);
        }

        es.shutdown();

    }
}
