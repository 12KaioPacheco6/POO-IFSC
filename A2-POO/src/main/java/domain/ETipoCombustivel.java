
package domain;

public enum ETipoCombustivel {
    GASOLINA ("Gasolina"), ETANOL("Etanol"), FLEX("Flex"), DIZEL("Dizel"), GNV("GNV"), OUTRO("Outro");
    
    private final String combustivel;
       
    private ETipoCombustivel (String combustivel){
        this.combustivel = combustivel;
    }
    
    public String getCombustivel(){
        return combustivel;
    }
}
