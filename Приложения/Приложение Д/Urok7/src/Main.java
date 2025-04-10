import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введи размерность: ");
            n = Integer.parseInt(sc.nextLine());
        } while (!lib.proverka(n));

        reis[] reis = lib.generationMass(n);
        System.out.println("Бaза данных: ");
        lib.display(reis);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введ. нижнюю границу стоимости:");
        int minTotal = sc.nextInt();
        System.out.print("Введ. верхнюю границу стоимости:");
        int maxTotal = sc.nextInt();
        sc.close();
        System.out.println("Результат выбора: ");
        Library.filter(reis, minTotal, maxTotal);
    }
}