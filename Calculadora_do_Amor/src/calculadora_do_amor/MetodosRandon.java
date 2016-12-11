/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_do_amor;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Fernandes
 */
public class MetodosRandon {

    void resposta() {
        String resposta[] = new String[20];

        Random randon = new Random();
        int r = randon.nextInt(20);

        for (int i = 0; i < 20; i++) {
            resposta[0] = "Ele(a) esta a fim de Você";
            resposta[1] = "Cai fora Sogra má na Area";
            resposta[2] = "Ele(a) só quer a sua Amizade";
            resposta[3] = "Da um tempo Nele(a)";
            resposta[4] = "Vai da Casamento";
            resposta[5] = "Pede ele(a)em Casamento";
            resposta[6] = "Sai dessa enquanto e Cedo";
            resposta[7] = "Ele(a) esta a fim do(a) outro(a)";
            resposta[8] = "Ele(a) esta Pensando em ti Agora";
            resposta[9] = "Faz uma Supresa pra ele(a)";
            resposta[10] = "Rouba Um Beijo Nele(a)";
            resposta[11] = "Convida ele(a) pra Sair";
            resposta[12] = "Ele(a) vé você como irmã(o)";
            resposta[13] = "So na Amizade";
            resposta[14] = "Pede o numero dele(a)";
            resposta[15] = "O pai dele(a) é malvado";
            resposta[16] = "Ele(a) esta 100 % a fim de você";
            resposta[17] = "Vai devagar Prea Nao se Feri";
            resposta[18] = "Pega o celular e liga já";
            resposta[19] = "Ele(a) esta sem Tempo";

        }
        JOptionPane.showMessageDialog(null, resposta[r]);

    }

}
