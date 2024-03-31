package mergesortcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService es;


    public Sorter(List<Integer> arrayToSort, ExecutorService es){
        this.arrayToSort = arrayToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() == 1){
            return arrayToSort;
        }

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        int mid = arrayToSort.size()/2;

        for(int i=0; i<mid; i++){
            leftArrayToSort.add(arrayToSort.get(i));
        }
        for(int i=mid; i<arrayToSort.size(); i++){
            rightArrayToSort.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArrayToSort, es);
        Future<List<Integer>> futureSortedLeftList =  es.submit(leftArraySorter);

        Sorter rightArraySorter = new Sorter(rightArrayToSort, es);
        Future<List<Integer>> futureSortedRightList =  es.submit(rightArraySorter);

        List<Integer> leftSortedList = futureSortedLeftList.get();
        List<Integer> rightSortedList = futureSortedRightList.get();

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if(leftSortedList.get(i) <= rightSortedList.get(j)){
                sortedArray.add(leftSortedList.get(i));
                i++;
            }else{
                sortedArray.add(rightSortedList.get(i));
                j++;
            }
        }

        while(i<leftSortedList.size()){
            sortedArray.add(leftSortedList.get(i));
            i++;
        }

        while(j<rightSortedList.size()){
            sortedArray.add(rightSortedList.get(j));
            j++;
        }

        return sortedArray;
    }
}
