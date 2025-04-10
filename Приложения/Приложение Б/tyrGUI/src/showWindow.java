import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class showWindow extends JFrame{
    private JPanel panel1;
    private JTable table1;
private ArrayList<ticket> _tickets;
    showWindow(ArrayList<ticket> tickets){
        setContentPane(panel1);
        setTitle("Купленные билеты");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        _tickets=tickets;



        /*sochi_ticket a =(sochi_ticket) tickets.getFirst();
        create_ticket createTicket = a.getCreateTicket();
        */

        setVisible(true);
    }

    private void createUIComponents() {

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Имя");
        model.addColumn("Фамилия");
        model.addColumn("Дата");

        Object[] row =new Object[model.getColumnCount()];

        for (int i = 0; i < _tickets.size(); i++) {
            ticket t=_tickets.get(i);
            sochi_ticket a =(sochi_ticket) t;
            create_ticket createTicket = a.getCreateTicket();
            row[i]=createTicket;
        }


        //


         model.addRow(row);

        table1=new JTable(model);
        table1.setDefaultEditor(Object.class, null);
        table1.setFillsViewportHeight(true);
    }
}
