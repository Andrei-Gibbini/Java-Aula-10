package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        //o Método equals retorna um valor verdadeiro ou falso e deve sempre ter o  Try - Catch.
        String senha = JOptionPane.showInputDialog("digite sua senha");
        if (senha.equals("P4sswOrD")){
            JOptionPane.showMessageDialog(null, "Acesso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        //o Método equalIgnoreCase tem a mesma função do Equals normal, porém ele ignora se está em maiúscula ou não
        if (senha.equalsIgnoreCase("P4sswOrD")){
            JOptionPane.showMessageDialog(null, "Autoriado Acesso");
        } else {
            JOptionPane.showMessageDialog(null, "Proibido Acesso");
        }
    }
}
