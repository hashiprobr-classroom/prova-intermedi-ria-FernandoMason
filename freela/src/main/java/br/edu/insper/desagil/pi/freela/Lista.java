package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adiciona(Tarefa nova){
        for(Tarefa t : tarefas){
            if (t.getIdentificador() == nova.getIdentificador()){
                return;
            }
        }
        tarefas.add(nova);
    }
}
