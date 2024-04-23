import javax.swing.*;
import java.awt.event.ActionEvent;

public class MarcarExames extends JFrame{
    private JTextField marcarExamesTextField;
    private JButton confirmarButton;
    private JButton voltarButton;
    private JComboBox comboTipoCat;
    private JComboBox comboTipoExame;
    private JComboBox comboAlunos;
    private JComboBox comboHoras;
    private JComboBox comboInst;
    private JTextField instrutorTextField;
    private JTextField horasTextField;
    private JTextField alunoSTextField;
    private JTextField tipoDeExameTextField;
    private JTextField tipoDeCategoriaTextField;
    private JPanel marcarExames;

    public MarcarExames() {

        String tipoExames [] = {"Código", "Condução"};
        comboTipoExame = new JComboBox(tipoExames);
        this.add(comboTipoExame);

        String tipoCategorias [] = {"Motociclo", "Ligeiro", "Pesado", "Trator"};
        comboTipoCat = new JComboBox(tipoCategorias);
        this.add(comboTipoCat);

        String tipoHoras [] = {"9", "10", "11", "12", "14", "15", "16", "17"};
        comboHoras = new JComboBox(tipoHoras);
        this.add(comboHoras);



    }

    private void btnVoltarActionPerformed(ActionEvent e) {
        GestorExames janela = new GestorExames();
        janela.setVisible(true);
    }

}
