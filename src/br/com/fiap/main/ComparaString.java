package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("digite sua senha");
        if (senha.equals("P4sswOrD")){
            JOptionPane.showMessageDialog(null, "Acesso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        if (senha.equalsIgnoreCase("P4sswOrD")){
            JOptionPane.showMessageDialog(null, "Autoriado Acesso");
        } else {
            JOptionPane.showMessageDialog(null, "Proibido Acesso");
        }
    }
}
