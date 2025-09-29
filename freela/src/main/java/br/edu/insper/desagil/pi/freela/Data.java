package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano = 1970;
    private int mes = 1;
    private int dia = 1;

    private Map<Integer,Integer> limite;

    public Data(){
        limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia){
        this.ano = ajusta(novoAno,1970,2070);
        this.mes = ajusta(novoMes, 1,12);
        int maxDia = limite.get(this.mes);
        this.dia = ajusta(novoDia,1,maxDia);
    }


    @Override
    public int getMinutos(){
        int anosPassados = ano-1970;
        int diasPorAno = 365;
        int totalDias = anosPassados * diasPorAno;

        for( int i =1; i < mes; i ++){
            totalDias += limite.get(i);
        }
        totalDias += (dia+1);

        return totalDias;
    }
}
