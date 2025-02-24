package domain;

public class Veiculo implements IDados {
    private int id;
    private String descricao;
    private Modelo modelo;
    private Cor cor;
    private Cliente cliente;
    
    public Veiculo(){
        this.id = 0;
        this.descricao = null;
        this.modelo = null;
        this.cor = null;
    }
    
    public Veiculo(int id, String descricao, Modelo modelo, Cor cor){
        this.id = id;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    

    public void setID(int id) {
        this.id = id;
    }
    
    public int getID() {
        return id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setModelo(Modelo modelo){
        this.modelo = modelo;
    }
    
    public Modelo getModelo(){
        return modelo;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("ID: " + this.id + "\n");
        dados.append("Descrição: " + this.descricao + "\n");
        dados.append("Modelo: " + this.modelo + "\n");
        dados.append("Cor: " + this.cor + "\n");
        return toString();
    }

    @Override
    public String getDados(String observacao) {
        return getDados() + "Observação: " + observacao;
    }
}
