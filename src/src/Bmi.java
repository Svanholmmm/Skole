public class Bmi {


    public static double getBmi(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}