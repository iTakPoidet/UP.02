import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введи размерноость: ");
            n = sc.nextInt();
        }while (!Library.proverka(n));
        AdvancedList list = new AdvancedList(n);
        System.out.println("Исходный список: ");
        System.out.println(list.toString());
        /*System.out.print("Введи год для выбора: ");
        sc = new Scanner(System.in);
        String  data = sc.nextLine();
        System.out.println("Результат выбора: ");
        System.out.println(list.result_filtr(data));*/
        /* System.out.print("Введи назввание мебели: ");
        sc = new Scanner(System.in);
        String prov = sc.nextLine();
        list.addNodeTag(n, prov);
        System.out.println("Исходный список: ");
        System.out.println(list.toString());
        list.addNodeEnd();
        System.out.println("Исходный список: ");
        System.out.println(list.toString());*/
        System.out.println("Введи год мебели");
        sc = new Scanner(System.in);
        String data = sc.nextLine();
        list.removeNodeTag(data);
        System.out.println("Исходный список: ");
        System.out.println(list.toString());
    }
}