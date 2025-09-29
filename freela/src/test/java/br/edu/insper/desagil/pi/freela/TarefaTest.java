package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TarefaTest {

    @Test
    public void constroi(){
        Tarefa t = new Tarefa(1);

        assertEquals(1,t.getIdentificador());
        assertEquals("",t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }


}
