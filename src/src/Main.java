import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hvor høj er du");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        System.out.println("Hvor meget vejer du?");
        Scanner sc2 = new Scanner(System.in);
        double weight = sc2.nextDouble();
        System.out.println("Du er " + height + "cm " + "Og du vejer " + weight + "kg" + " og dit bmi er " + Bmi.getBmi(height,weight));
    }


    }

