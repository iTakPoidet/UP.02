import java.util.Scanner;

/**
 * Class Library
 */
public class Library implements Applicable {

    //
    // Fields
    //

    //
    // Constructors
    //
    public Library() {
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    public boolean proverka(int n) {
        if (n <= 0) {
            System.out.println("Введи число больше 0");
            return false;
        } else {
            return true;
        }
    }

    //
    // Other methods
    //
    /**
     * @param n
     * @return reis[]
     */
    public reis[] generationMass(int n) {
        Scanner sc = new Scanner(System.in);
        reis[] array = new reis[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ввод " + (i + 1) + "-ой записи: ");

            System.out.print("Марка автомобиля: ");
            sc = new Scanner(System.in);
            String marka_Avto = sc.nextLine();

            System.out.print("Номер автомобиля: ");
            int nomer_Avto = sc.nextInt();

            sc = new Scanner(System.in);
            System.out.print("Пункт назначения: ");
            String punkt_Naznach = sc.nextLine();

            System.out.print("Грузоподъемность: ");
            int max_Gruz = sc.nextInt();

            System.out.print("Стоимость единицы груза: ");
            int edin_Gruz = sc.nextInt();

            System.out.print("Общая стоимость груза: ");
            int total = sc.nextInt();
            array[i] = new reis(marka_Avto,nomer_Avto,punkt_Naznach,max_Gruz,edin_Gruz,total);
        }
        return array;
    }


    /**
     * @param mass
     */
    public void display(reis[] mass) {
      for (int i = 0; i < mass.length; i++){
        System.out.println(mass[i].toString());
      }
    }
public static void filter(reis[] array, int minTotal, int maxTotal){
      int total;
      for(int i = 0; i < array.length; i++){
        total = array[i].getTotal();
        if (minTotal < total && total < maxTotal)
          System.out.println(array[i].toString());

      }
}
}