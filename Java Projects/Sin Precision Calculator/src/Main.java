public class Main {

    public static double degreesToRadians(double degrees){
        double radians  = degrees * (Math.PI / 180);

        return radians;
    }
    public static void main(String[] args) {

        int disiredPrecision = 17; // 17 == higher precision possible for this application
        SinCalculator sinWithGivenPrecision = new SinCalculator(disiredPrecision);  // create sinCalc obj w/ the desired precision

        double degree = 45;
        double valueInRadians = degreesToRadians(degree);

        double answer = sinWithGivenPrecision.calculateSinOf(valueInRadians); // method only works w/ radians

        System.out.println("values is: " + answer);
    }
}