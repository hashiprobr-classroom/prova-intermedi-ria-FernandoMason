package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {

    @Test
    public void constroi(){
        Lista lista = new Lista();

        assertEquals(0, lista.getTarefas().size());
    }

    @Test
    public void adicionaIguais(){
        Lista lista = new Lista();

        Tarefa t1 = new Tarefa(1);
        Tarefa t2 = new Tarefa(1);

        lista.adiciona(t1);
        lista.adiciona(t2);

        assertEquals(1, lista.getTarefas().size());
    }

    @Test
    public void adicionaDiferentes(){
        Lista lista = new Lista();

        Tarefa t1 = new Tarefa(1);
        Tarefa t2 = new Tarefa(2);

        lista.adiciona(t1);
        lista.adiciona(t2);

        assertEquals(2, lista.getTarefas().size());
    }
}
