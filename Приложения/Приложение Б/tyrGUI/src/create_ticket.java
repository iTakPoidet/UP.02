import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class create_ticket extends JFrame {

    private JTextField dataa;
    private JPanel panel1;
    private JTextField surnamee;
    private JTextField namee;
    private JButton create;
    private String name, surname, data;

    create_ticket(sochi_ticket a){
        super("Создать");
        setContentPane(panel1);
        setBounds(200,100,500,400);
        setVisible(true);
        create_ticket createTicket = this;
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = namee.getText();
                surname = surnamee.getText();
                data = dataa.getText();
                a.addTttt(createTicket);
                dispose();
            }
        });
    }
    /*create_ticket(turkey_ticket a){
        super("Создать");
        setContentPane(panel1);
        setBounds(200,100,500,400);
        setVisible(true);
        create_ticket createTicket = this;
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = namee.getText();
                surname = surnamee.getText();
                data = dataa.getText();
                a.addTttt(createTicket);
                dispose();
            }
        });
    }*/

    @Override
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getData() {
        return data;
    }
}
