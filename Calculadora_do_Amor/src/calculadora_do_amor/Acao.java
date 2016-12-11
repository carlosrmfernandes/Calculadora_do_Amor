/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_do_amor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Fernandes
 */
public class Acao implements ActionListener {

    Calculadora_do_Amor frame;
    setget se = new setget();

    public Acao(Calculadora_do_Amor frame) {
        this.frame = frame;
    }

    void limpar() {
        frame.jtseunome.setText("");
        frame.seuamor.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        if (frame.seuamor.getText().length() <= 0 && frame.jtseunome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Informe Os Vossos Nomes Por Favor ");
        } else if (frame.seuamor.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Informe O Nome do Seu Amor Por Favor ");

        } else if (frame.jtseunome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Informe O Seu Nome Por Favor ");

        } else if ("calculadora".equals(e.getActionCommand())) {

            se.setSenome(frame.jtseunome.getText());
            se.setSeuamor(frame.seuamor.getText());

            MetodosRandon s = new MetodosRandon();
            s.resposta();
            limpar();

        }
    }

}
