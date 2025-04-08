import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int m;
        double a;
        double b;
        double e;

        do {
            function f = new function();
            Scanner sc = new Scanner(System.in);
            System.out.println("Выбери подынтегральную функцию: ");
            System.out.println("1 - x^2+cos(x) ; 2 - (sin(x))/(1+x^2)");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    do {
                        System.out.println("Выбери Формулу: ");
                        System.out.println("1 - формула левых прямоугольников; 2 - формула правых прямоугольников");
                        m = sc.nextInt();

                        switch (m) {
                            case 1:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.leftRectangleMethod(a, b, e, 1));
                                System.out.println();
                                break;
                            case 2:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.rightRectangleMethod(a, b, e, 1));
                                System.out.println();
                                break;
                        }
                    } while ((m == 1) || (m == 2));
                    break;

                case 2:
                    do {
                        System.out.println("Выбери Формулу: ");
                        System.out.println("1 - формула левых прямоугольников; 2 - формула правых прямоугольников");
                        m = sc.nextInt();

                        switch (m) {
                            case 1:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.leftRectangleMethod(a, b, e, 2));
                                System.out.println();
                                break;
                            case 2:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.rightRectangleMethod(a, b, e, 2));
                                System.out.println();
                                break;
                        }
                    } while ((m == 1) || (m == 2));
                    break;
            }
        } while ((n == 1) || (n == 2));
    }
}