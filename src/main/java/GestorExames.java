import javax.swing.*;
import java.awt.event.ActionEvent;

public class GestorExames extends JFrame{
    private JTextField gerirExamesTextField;
    private JButton marcarExameButton;
    private JButton desmarcarExameButton;
    private JButton voltarButton;
    private JPanel GestorExames;

    public GestorExames() {
        super(title);

        //MUDAR PARA VOLTAR PARA ECRÃ ANTERIOR E PROCURAR FUNCAO btnVoltarActionPerformed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(GestorExames);
        pack();

        voltarButton.addActionListener(this::btnVoltarActionPerformed);
    }

    //MUDAR AQUI TAMBEM
    private void btnVoltarActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void btnMarcarExameActionPerformed(ActionEvent evt) {
        MarcarExames janela = new MarcarExames();
        janela.setVisible(true);
    }
}
