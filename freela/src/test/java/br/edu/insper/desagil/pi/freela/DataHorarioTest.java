package br.edu.insper.desagil.pi.freela;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {

    @Test
    public void constroi(){
        Data data = new Data();
        DataHorario h = new DataHorario(data);

        assertEquals(0, h.getHora());
        assertEquals(0,h.getMinuto());
    }
    @Test
    public void horarioBaixo(){
        Data data = new Data();
        DataHorario h = new DataHorario(data);

        h.setHorario(-1,-1);

        assertEquals(0,h.getHora());
        assertEquals(0,h.getMinuto());
    }
    @Test
    public void horarioAlto(){
        Data data = new Data();
        DataHorario h = new DataHorario(data);

        h.setHorario(24,60);

        assertEquals(23,h.getHora());
        assertEquals(59,h.getMinuto());
    }
}
