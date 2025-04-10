import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bot extends JFrame{
    private JPanel p;
    private JButton next;

    bot(){
        super("Приветствие!!!");
        setContentPane(p);
        setBounds(200,100,500,400);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new glavMenu();
                dispose();
            }
        });
    }

}
