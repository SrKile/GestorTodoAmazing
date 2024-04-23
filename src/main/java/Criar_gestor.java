import javax.swing.*;
import java.awt.event.ActionEvent;

public class Criar_gestor extends JFrame {
    private JPanel panel1;
    private JTextField Nome;
    private JTextField Curriculo;
    private JTextField numCC;
    private JButton voltarButton;
    private JButton Criar;

    public Criar_gestor() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        voltarButton.addActionListener(this::btnVoltarActionPerformed);
        Criar.addActionListener(this::btnCriarPerformed);
    }

    private void btnVoltarActionPerformed(ActionEvent actionEvent) {
        // adicionar metoodo para voltar a janela anterior
    }

    private void btnCriarPerformed(java.awt.event.ActionEvent evt) {
        var janela = new LoginGestor2();
        janela.setVisible(true); // se não foi executado no construtor…
    }

}