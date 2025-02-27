package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente implements IDados{
    protected int id;
    protected String nome;
    protected String celular;
    protected String email;
    protected String dtCadastro;
    protected Pontuacao pontuacao = new Pontuacao();
    protected List<Veiculo> veiculos = new ArrayList<>();

    
    public Cliente() {
        this.id = 0;
        this.nome = null;
        this.celular = null;
        this.email = null;
        this.dtCadastro = null;
    }
    
    public Cliente(int id, String nome, String celular, String email, String dtcadastro, Pontuacao pontuacao) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dtCadastro = dtcadastro; 
        this.pontuacao = new Pontuacao();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtcadastro() {
        return dtCadastro;
    }

    public void setDtcadastro(String dtcadastro) {
        this.dtCadastro = dtcadastro;
    }
    
    public Pontuacao getPontuacao(){
        return this.pontuacao;
    }

    //metodo para que associar um cliente ao veiculo adicionado
    public void add(Veiculo veiculos){
        this.veiculos.add(veiculos);
        veiculos.setCliente(this); //faz referência ao veiculo relacionado com o cliente e é add na lista
    }

    public void remove(Veiculo veiculos){
        this.veiculos.remove(veiculos);
        veiculos.setCliente(null);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: ").append(this.nome).append("\n");
        dados.append("Celular: ").append(this.celular).append("\n");
        dados.append("Email: ").append(this.email).append("\n");
        dados.append("Data de Cadastro: ").append(this.dtCadastro).append("\n");
        dados.append("Pontuação: ").append(this.getPontuacao().saldo()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String observacao){
        return getDados() 
            + " Observação: " + observacao;
    }
}
