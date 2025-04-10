import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class glavMenu extends JFrame{
    private JPanel panel1;
    private JButton sochi;
    private JButton turkey;
    private JButton show;
    private JButton exit;

    ArrayList<ticket> tickets = new ArrayList<>();
    public glavMenu() {
        super("Турагенство");
        setContentPane(panel1);
        setBounds(200,100,600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        glavMenu parent=this;

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        sochi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sochi_ticket sochiTicket = new sochi_ticket(parent);
            }
        });

        turkey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket t = tickets.getLast();
                sochi_ticket a =(sochi_ticket) t;
                create_ticket createTicket = a.getCreateTicket();
                System.out.println(createTicket.getName() + " - Имя, " + createTicket.getSurname() +
                        " - Фамилия, " + createTicket.getData() + " -  Дата;");
            }
        });

        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new showWindow(tickets);
            }
        });
    }
    public void addTicket(sochi_ticket sochiTicket){
        tickets.add(sochiTicket);
    }
}
