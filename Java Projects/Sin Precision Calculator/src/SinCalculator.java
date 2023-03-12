import java.util.LinkedList;
import java.util.Queue;

public class SinCalculator {
    private final int numbIterations;
    private Queue<Character> signalsQueue;

    public SinCalculator(int precision){
        this.numbIterations = precision;
        this.signalsQueue = new LinkedList<>();
        this.signalsQueue.add('+');
        this.signalsQueue.add('-');
    }

    public int getNumbIterations() {
        return numbIterations;
    }

    private Character getNextSignal(){
        Character nextSignal = this.signalsQueue.remove();
        this.signalsQueue.add(nextSignal);

        return nextSignal;
    }

    private int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = x; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculateSinOf(double x){
        // x == radians
        // int == primitive type, NON NULL
        // Integer == Class type (... = new Integer(13)), NULL!

        int pivot = 1;
        double total = (double) 0;

        for(int i = 1; i <= this.numbIterations; i++, pivot += 2){
            double numerator = Math.pow(x, pivot);
            int den = factorial(pivot);

            double fracResult = numerator / den;
            if(getNextSignal() == '+'){
                total += fracResult;
            }else {
                total -= fracResult;
            }
        }

        return total;
    }
}
