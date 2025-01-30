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

    //metodo para que adicionar um cliente ao veiculo adicionado
    public void remove(Veiculo veiculo){
        this.veiculos.remove(veiculo);
        veiculo.setCliente(null);
    }

    public void add(Veiculo veiculo){
        this.veiculos.add(veiculo);
        veiculo.setCliente(this);
    }

    public ArrayList <Veiculo> getVeiculo() {
        return (ArrayList<Veiculo>) veiculos;
    }

    @Override
    public String getDados(){
        return "ID:  " + id + 
            "Nome: " + nome  + 
            "Celular: " + celular + 
            "E-mail: " + email + 
            "Data de Cadastro: " + dtCadastro;
    }

    @Override
    public String getDados(String observacao){
        return getDados() 
            + " Observação: " + observacao;
    }
}
