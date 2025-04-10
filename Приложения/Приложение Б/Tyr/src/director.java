import java.util.ArrayList;
import java.util.Scanner;
public class director {
  Scanner sc;private ArrayList<ticket> ticket = new ArrayList<>();int n;
  public director () {
    build();
  };
  public  ticket getTicket (int i) {
    return ticket.get(i);
  }
  public void build(){
    System.out.println("Здравствуйте! Что хотите сделать!");
    do {
      System.out.println("1 - билет турция; 2 - билет сочи; 3 - посмотреть статусы; 4 - Выход");
      sc = new Scanner(System.in);
      n = sc.nextInt();
      switch (n){
        case 1:
          turkey_ticket tt = new turkey_ticket();
          if (tt.save){ ticket.add(tt);}
          break;
        case 2:
          sochi_ticket st = new sochi_ticket();
          if (st.save){ ticket.add(st);}
          break;
        case 3:
          showTicket();
          break;
        case 4:
          break;
        default:
          System.out.println("Это че за команда!");
          break;
      }
    }while (n != 4);}
  public void showTicket(){
    try {
      if (ticket.isEmpty()){
        System.out.println("Билетов нету");
      }
      for (int i = 0; i < ticket.size(); i++) {
        if (getTicket(i).getClass() == turkey_ticket.class){
          System.out.print("Билет в Турцию " + (i+1) + ": ");
          getTicket(i).show();
        }else {
          System.out.print("Билет в Сочи " + (i+1) + ": ");
          getTicket(i).show();
        }
      }
    }catch (Exception ex){
      System.out.println("Билетов нету");
    }}}
