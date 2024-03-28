package myFirstMultiThreadedProgram;

public class HelloWorldPrinter implements Runnable{

    public void printHi(){
        System.out.println("hi from printHi " + Thread.currentThread());
    }

    @Override
    public void run() {
        System.out.println("Hello World " + Thread.currentThread());
        printHi();
    }
}
