package br.com.fiap.main;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        JOptionPane.showMessageDialog(null, frase.length());
        // o Método lenght retorna o tamanho da minha String
        JOptionPane.showMessageDialog(null, frase.toUpperCase());
        //Ele altera toda a frase para Maiúscula
        JOptionPane.showMessageDialog(null, frase.substring(30,34));
        //o Método substring mostra um trecho específico, baseado no Índice (o Índice sempre conta um caracter a mais do que o texto tem).
        JOptionPane.showMessageDialog(null, frase.replace("roupa", "sapato"));
        // o Método replace muda um trecho ou letra específico (que deve ser definido) para outro que queiramos no lugar.
    }
}
