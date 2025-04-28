package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        //Nesse objeto eu tenho a data atual
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
        //define um tempo específico
        Period periiodo = Period.between(fimDosTempos, dataAtual);
        //O método atual apresenta o período entre duas datas. Dece-se usar sempre o mais antigo primeiro.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Formata a exibição da data
        JOptionPane.showMessageDialog(null, String.format("Data Atual: %s \nData do Fim do Mundo: %s \nDesde os fins dos tempos, passaram-se %d ano(s), %d mês(es) e %d fias(s)", dataAtual.format(dtf), fimDosTempos.format(dtf), periiodo.getYears(), periiodo.getMonths(), periiodo.getDays()));
    }
}
