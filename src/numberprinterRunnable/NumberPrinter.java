package numberprinterRunnable;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printed Number " + numberToPrint + " happend from " + Thread.currentThread());
    }
}
