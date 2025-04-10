import java.util.Random;

public class turkey {
  private state state;
  public turkey () {
    changeState();
  };
  public String getState () {
    return state.getText();
  }
  public void changeState()
  {
    Random rd = new Random();
    int n = rd.nextInt(3)+1;
    switch (n){
      case 1:
        state = new start();
        break;
      case 2:
        state = new work();
        break;
      case 3:
        state = new cancel();
        break;
    }
  }
}
