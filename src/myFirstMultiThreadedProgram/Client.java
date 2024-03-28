package myFirstMultiThreadedProgram;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        System.out.println("hi from " + Thread.currentThread());
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("2 nd hi from " + Thread.currentThread());
    }
}
