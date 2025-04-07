import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи A: ");
        double a = sc.nextDouble();
        System.out.print("Введи B: ");
        double b = sc.nextDouble();
        System.out.print("Введи E: ");
        double e = sc.nextDouble();

        System.out.println("Ответ: " + MA.leftRectangleMethod(a, b, e));
        System.out.println("Ответ: " + MA.rightRectangleMethod(a, b, e));
    }
}