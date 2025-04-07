import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи начальное число: ");
        double x = sc.nextDouble();
        System.out.print("Введи минимальное а: ");
        double a0 = sc.nextDouble();
        System.out.print("Введи максимальное а: ");
        double an = sc.nextDouble();
        System.out.print("Введи шаг: ");
        double h = sc.nextDouble();

        for (double a = a0; a <= an; a = a + h) {
            System.out.println("Ответ: " + ModNewtonMethod.simpleIteration(x, a));
        }
    }
}