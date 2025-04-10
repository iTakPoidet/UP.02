import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Введите натуральное число: ");
            n = sc.nextInt();
        }
        while (Library.proverka(n) == false);
        sc.close();
        final int min = 0;
        final int max = 10;
        int[] a = Library.generationMass(min, max, n);
        int[] b = Library.generationMass(min, max, n);
        int[] c = Library.generationMass(min, max, n);
        System.out.println("Массив а: " + Arrays.toString(a));
        System.out.println("Массив b: " + Arrays.toString(b));
        System.out.println("Массив c: " + Arrays.toString(c));
        Library lib = new Library();
        lib.sumOst(a,b,c);
        System.out.println("Максимальный объем: " + lib.volume(a,b,c));
        System.out.println("Сумма: " + lib.getScore());
    }
}