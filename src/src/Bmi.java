public class Bmi {
    public static double getBmi(double weight, double height) {
        double bmi = weight / (Math.pow(height, 2));
        return bmi;
    }
}