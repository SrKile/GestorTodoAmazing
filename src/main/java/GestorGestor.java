import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorGestor {
    private JPanel panel1;
    private JTextField gestorAdminTextField;
    private JButton listaDeAlunosEButton;
    private JButton gerirAulasButton1;
    private JButton gerirExamesButton;
    private JButton gerirAulasButton;
    private JButton voltarButton;

    public GestorGestor() {
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
