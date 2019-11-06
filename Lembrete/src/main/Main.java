package main;

import infra.LembreteDAO;
import model.Lembrete;

public class Main {

    public static void main(String[] args) {
        Lembrete lembrete = new Lembrete();
        LembreteDAO lembreteDAO = new LembreteDAO();

        lembrete.setTitulo("Titulo 1");
        lembrete.setMensagem("Mensagem 1");

        lembreteDAO.create(lembrete);
    }
}
