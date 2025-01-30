package domain;

public class Motor {
    private int potencia;
    
    private ETipoCombustivel combustivel = ETipoCombustivel.GASOLINA;
    
    public Motor()
    {
        this.potencia = 0;
    }
    
    public Motor(int potencia, ETipoCombustivel combustivel)
    {
        this.potencia = potencia;
        this.combustivel = combustivel;
    }
    
    public ETipoCombustivel getCombustivel() {
        return combustivel;
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void setCombustivel(ETipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }
}
