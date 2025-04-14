import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        Версия 1
        Функция: Вводить ФИО учеников
        Данные: есть
        ©️ все права защищены

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scan.nextInt();
        massiv mas = new massiv();
        // массивы для работы с программой
        String[] stud = new String[n];
        int[] oc = new int[n];
        //заполнение массива студент
        mas.vvodstud(n, stud);
        mas.vvodoc(n, oc);
        int f;
        do {
            System.out.println();
            System.out.println("1 - Вывести списки; 2 - список отличников; 3 - список хорошистов; 4 - список троечников; 5 - Список должников; 6 - Средний балл; 7 - Поиск ученика;");
            scan = new Scanner(System.in);
            f = scan.nextInt();
            switch (f){
                case 1:
                    System.out.println("Оценочная ведомость основная");
                    mas.print(n, stud, oc);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Количество отличников");
                    System.out.println(mas.otl(stud, oc).length);
                    System.out.println("Список отличников");
                    System.out.println(Arrays.toString(mas.otl(stud, oc)));
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Количество хорошистов");
                    System.out.println(mas.xor(stud, oc).length);
                    System.out.println("Список хорошистов");
                    System.out.println(Arrays.toString(mas.xor(stud, oc)));
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Количество троечников");
                    System.out.println(mas.tryki(stud, oc).length);
                    System.out.println("Список троечников");
                    System.out.println(Arrays.toString(mas.tryki(stud, oc)));
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Количество должников");
                    System.out.println(mas.dolzhniki(stud, oc).length);
                    System.out.println("Список должников");
                    System.out.println(Arrays.toString(mas.dolzhniki(stud, oc)));
                    break;
                case 6:
                    System.out.println("Cредний балл: " + mas.sredoc(oc));
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Поиск ученика");
                    System.out.println(Arrays.toString(mas.poisk(stud, oc)));
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Нету такой команды!");
            }
        }while (f != 8);
    }
}