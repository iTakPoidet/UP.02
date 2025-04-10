import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введи размерноость: ");
            n = sc.nextInt();
        }while (!Library.proverka(n));
        mebel_List list = new mebel_List(n);
        System.out.println("Исходный список: ");
        System.out.println(list.toString());
        System.out.print("Введи год для выбора: ");
        sc = new Scanner(System.in);
        String  data = sc.nextLine();
        System.out.println("Результат выбора: ");
        System.out.println(list.result_filtr(data));
    }
}