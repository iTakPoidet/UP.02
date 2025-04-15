import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Версия программы: 1\n" +
                "Функции программы: работают\n" +
                "Данные о разработчиках: Степанов,Красуцкий\n" +
                "©\uFE0F все права защищены\n");
        System.out.print("Введи начало работы: ");
        String beginWorkingTime = sc.nextLine();
        System.out.print("Введи конец работы: ");
        String endWorkingTime = sc.nextLine();
        System.out.print("Введи отрезки работы: ");
        int consultationTime = Integer.parseInt(sc.nextLine());
        System.out.print("Введи сколько занятых часов работы: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] startTimes = new String[n];
        int[] durations = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введи начало занятой работы: ");
            startTimes[i] = sc.next();
            System.out.print("Введи продолжительность работы: ");
            durations[i] = Integer.parseInt(sc.next());
        }

        ArrayList<String> freeIntervals = Calculations.availablePeriods(startTimes, durations, consultationTime, beginWorkingTime, endWorkingTime);

        for (String interval : freeIntervals) {
            System.out.println(interval);
        }
    }
}