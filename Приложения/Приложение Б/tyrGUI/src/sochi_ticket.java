import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sochi_ticket extends JFrame implements ticket {
    private JButton купитьButton;
    private JPanel panel1;
    private JButton отменаButton;
    private create_ticket createTicket;
    private glavMenu glavMenu;
    private sochi_ticket parent;
    public sochi_ticket(glavMenu glavMenu1) {
        super("Билет в Сочи!");
        glavMenu = glavMenu1;
        setContentPane(panel1);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(200, 100, 400, 300);
        setVisible(true);
        parent = this;
        отменаButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
            }
        });
        купитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buy();
            }
        });


    }

    @Override
    public void buy() {
        create_ticket createTicket = new create_ticket(parent);
        glavMenu.addTicket(this);
        dispose();
    }
    @Override
    public void cancel() {
        dispose();
    }

    @Override
    public void save(create_ticket a) {
        createTicket = a;
    }

    public create_ticket getCreateTicket() {
        return createTicket;
    }
    public void addTttt(create_ticket createTicket){
        save(createTicket);
    }
}
