import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class massiv {
    //объявила поля класса
    public String[] stud;
    public int[] oc;
    // ввод массива фио
    public String[] vvodstud(int n, String[] stud) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) stud[i] = scan.nextLine();
        return stud;
    }

    // ввод массива оценки
    public int[] vvodoc(int n, int[] oc) {
        //int [] oc=new int[n];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) oc[i] = (int) (Math.random() * (5) + 1);
        return oc;
    }

    // вывод массива оценки+фио
    public void print(int n, String[] Stud, int[] oc) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) System.out.println("ФИО:" + Stud[i] + " оценка " + oc[i]);
    }

    // поиск отличников
    public String[] otl(String[] stud, int[] oc) {
        int kol = 0;
        int j = 0;
        for (int i = 0; i < stud.length; i++)
            if (oc[i] == 5) kol += 1;
        String[] OTL = new String[kol];
        for (int i = 0; i < stud.length; i++) {
            if (oc[i] == 5) {
                OTL[j] = stud[i];
                j++;
            }
        }
        Arrays.sort(OTL);
        return OTL;
    }

    public int sredoc(int[] oc) {
        int sred = 0;
        int kol = 0;
        for (int i = 0; i < oc.length; i++) {
            sred = sred + oc[i];
            kol++;
        }
        return sred / kol;
    }

    public String[] xor(String[] stud, int[] oc) {
        int kol = 0;
        int j = 0;
        for (int i = 0; i < stud.length; i++)
            if (oc[i] == 4) kol += 1;
        String[] XOR = new String[kol];
        for (int i = 0; i < stud.length; i++) {
            if (oc[i] == 4) {
                XOR[j] = stud[i];
                j++;
            }
        }
        Arrays.sort(XOR, Comparator.reverseOrder());
        return XOR;
    }

    public String[] tryki(String[] stud, int[] oc) {
        int kol = 0;
        int j = 0;
        for (int i = 0; i < stud.length; i++)
            if (oc[i] == 3) kol += 1;
        String[] TRY = new String[kol];
        for (int i = 0; i < stud.length; i++) {
            if (oc[i] == 3) {
                TRY[j] = stud[i];
                j++;
            }
        }
        return TRY;
    }

    public String[] dolzhniki(String[] stud, int[] oc) {
        int kol = 0;
        int j = 0;
        for (int i = 0; i < stud.length; i++) {
            if ((oc[i] == 2) || (oc[i] == 1)) kol += 1;
        }
        String[] DOL = new String[kol];
        for (int i = 0; i < stud.length; i++) {
            if ((oc[i] == 2) || (oc[i] == 1)) {
                DOL[j] = stud[i];
                j++;
            }
        }
        return DOL;
    }
    public String[] poisk(String[] stud, int[] oc){
        Scanner sc = new Scanner(System.in);
        int kol = 0;
        System.out.print("Введите ФИО ученика: ");
        String name = sc.nextLine();
        for (int i = 0; i < stud.length; i++){
            if (Objects.equals(stud[i], name)){
                kol++;
            }
        }
        int j = 0;
        String[] DOL = new String[kol];
        for (int i = 0; i < stud.length; i++) {
            if (Objects.equals(stud[i], name)) {
                DOL[j] = String.valueOf(oc[i]);
                j++;
            }
        }
        return DOL;
    }
}