package executerserviceandcallable;

import java.util.concurrent.Callable;

public class MathematicalOperation implements Callable<Integer> {

    private int firstNumber;
    private int secondNumber;

    public MathematicalOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public Integer call() throws Exception {

        return firstNumber + secondNumber;

    }
}
