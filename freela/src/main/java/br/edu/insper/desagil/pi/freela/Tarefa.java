package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int identificador;
    private String descricao ="";
    private Momento inicio = null;
    private Momento fim = null;

    public Tarefa(int identificador){
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public void atualiza(Momento novoInicio, Momento novoFim) throws IllegalAccessException {
        if(novoInicio.getMinutos() >= novoFim.getMinutos()){
            throw new IllegalAccessException("O inicio deve ser antes do fim!");
        }
        this.inicio = novoInicio;
        this.fim = novoFim;
    }
}
