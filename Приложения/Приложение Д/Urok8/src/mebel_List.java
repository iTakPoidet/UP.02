import java.util.Objects;
import java.util.Scanner;

public class mebel_List implements Applicable {
    private nodeMebel begin;

    public mebel_List(int n) {
        System.out.println("Ввод 1-ой записи: ");
        begin = new nodeMebel(generationMass());
        nodeMebel current = begin;
        for (int i = 1; i < n; i++) {
            System.out.println("Ввод " + (i + 1) + " -ой записи: ");
            current.setNext(new nodeMebel(generationMass()));
            current = current.getNext();
        }
    }
    public mebel generationMass() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Название: ");
        String name = sc.nextLine();

        System.out.print("Комплектация: ");
        String  komplect = sc.nextLine();

        System.out.print("Фирма: ");
        String furma = sc.nextLine();

        System.out.print("Год: ");
        String data = sc.nextLine();

        System.out.print("Назначение: ");
        String naznach = sc.nextLine();

        System.out.print("Материал: ");
        String material = sc.nextLine();

        return new mebel(name,komplect,furma,data,naznach,material);
    }


    public String toString() {
        String result = "";
        nodeMebel current = this.begin;
        while (current != null) {
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    @Override
    public String result_filtr(String data) {
        String result = "";
        nodeMebel current = begin;
        while (current != null) {
            if (Objects.equals(current.getMebel().getData(), data)){
                result = result + current.toString() + "\n";
            }
            current = current.getNext();
        }
        return result;
    }
}
