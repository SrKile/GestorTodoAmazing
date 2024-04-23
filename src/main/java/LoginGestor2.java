import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginGestor2 extends JFrame {
    private JButton entrarButton;
    private JButton criarButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel panel1;

    public LoginGestor2() {
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        criarButton.addActionListener(this::btnCriarPerformed);
    }


    private void btnCriarPerformed(java.awt.event.ActionEvent evt) {
        var janela = new LoginGestor2();
        janela.setVisible(true); // se não foi executado no construtor…
    }

}
