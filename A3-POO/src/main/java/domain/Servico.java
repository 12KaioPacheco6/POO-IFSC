package domain;

public class Servico {
    private int id;
    private String descricao;
    private double valor;
    private int pontos;

    private ECategoria categoria = ECategoria.MEDIO;


    Servico() {
        this.id = 0;
        this.descricao = null;
        this.valor = 0;
        this.pontos = 0;
    }

    public Servico(int id, String descricao, double valor, int pontos, ECategoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.pontos = pontos;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }
}
