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
        dados.append("Dados do veiculo: ").append("\n");
        dados.append("ID: ").append(this.id).append("\n");
        dados.append("Descricao: ").append(this.descricao).append("\n");
        dados.append("Modelo: ").append(this.modelo.marca.getNome()).append("\n");
        dados.append("Motor: ").append(this.modelo.getMotor().getPotencia()).append("\n");
        dados.append("Cor: ").append(this.cor.getCor()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String observacao) {
        return getDados() + "Observação: " + observacao;
    }
}
