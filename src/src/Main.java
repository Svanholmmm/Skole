import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Hvor meget vejer du i kg?");
        double weight = sc.nextDouble();
        System.out.println("Hvor høj er du i meter?");
        double height = sc.nextDouble();
        System.out.println("Du er " + height + "cm " + "Og du vejer " + weight + "kg" + " og dit bmi er " + Bmi.getBmi(weight,height));
        if(Bmi.getBmi(weight, height) >= 20){
            System.out.println("Du er sej");
        }else{ System.out.println("Du er ikke sej");
            }
        }
    }




