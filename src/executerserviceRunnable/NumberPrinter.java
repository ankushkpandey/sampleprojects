package executerserviceRunnable;

public class NumberPrinter implements Runnable{
    private int number;
    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number printed " + number + " from Thread " + Thread.currentThread().getName());
    }
}
