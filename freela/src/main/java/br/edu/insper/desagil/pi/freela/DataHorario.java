package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora = 0;
    private int minuto = 0;
    private Data data;

    public DataHorario(Data data){
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setHorario(int novaHora, int novoMinuto){
        this.hora = ajusta(novaHora,0,23);
        this.minuto = ajusta(novoMinuto,0,59);
    }

    @Override
    public int getMinutos() {
        int minutosData = data.getMinutos();

        return minutosData + (hora*60);
    }
}
