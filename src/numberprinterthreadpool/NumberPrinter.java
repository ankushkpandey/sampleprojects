package numberprinterthreadpool;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printed Number " + numberToPrint + " happend from " + Thread.currentThread());
    }
}
