
package domain;


public class Modelo {
    private int id;
    private String modelo;
    Marca marca;
    
    private Motor motor = new Motor();
    private ECategoria categoria = ECategoria.PADRAO;

    public Modelo(){
        this.id = 0;
        this.modelo = null;
        this.marca = null;
    }
   
    public Modelo(int id, String modelo, Marca marca, int potencia,ECategoria categoria, ETipoCombustivel ETipoCombuativel){
        this.motor = new Motor(potencia, ETipoCombuativel);
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }
    
    public Motor getMotor() {
        return motor;
    }
        
}
