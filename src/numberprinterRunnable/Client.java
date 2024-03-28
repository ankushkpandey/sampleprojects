package numberprinterRunnable;

public class Client {

    public static void main(String[] args) {
        System.out.println("WIll start printing Number - " + Thread.currentThread());
        for(int i=0; i<100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i+1);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }


}
