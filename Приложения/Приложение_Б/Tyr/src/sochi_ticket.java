import java.util.Scanner;

public class sochi_ticket implements ticket {
  Scanner sc;boolean save;private sochi result;
  public sochi_ticket () {
    int n;
    boolean f = false;
    do {
      sc = new Scanner(System.in);
      System.out.println("1 = купить билет; 2 = Отменить билет;");
      n = sc.nextInt();
      switch (n){
        case 1:
          buy();
          f = true;
          break;
        case 2:
          cancel();
          f = true;
          break;
        default:
          System.out.println("Это че за команда");
      }
    }while (!f);};
  public void buy() {
    sochi ticket = new sochi();
    result = ticket;
    System.out.println("Билет куплен");
    save = true;
  }
  public void cancel() {
    if (result != null) {
      result = null;
      System.out.println("Билет удален");
      save = false;
    }}
  @Override
  public void show() {
    System.out.println(result.getState());
  }}
