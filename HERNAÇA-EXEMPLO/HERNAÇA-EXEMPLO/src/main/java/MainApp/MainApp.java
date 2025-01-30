package MainApp;
import domain.*;

public class MainApp {
    public static void main(String[] args) {
        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setNome("ABC nacional");
        fornecedorNacional.setId(1);
        fornecedorNacional.setEmail("1nacional@gmail.com");
        fornecedorNacional.setFone("111-222");
        fornecedorNacional.setCnpj("15521558-54");
        printFornercedorNacional(fornecedorNacional);
        
        Internacional fornecedorInternacional = new Internacional();
        fornecedorInternacional.setNome("ABC internacional");
        fornecedorInternacional.setId(1);
        fornecedorInternacional.setEmail("1internacional@gmail.com");
        fornecedorInternacional.setFone("122-222");
        fornecedorInternacional.setPais("Roma");
        printFornercedorInteracional(fornecedorInternacional);
    }
    
    public static void printFornercedorNacional(Nacional nacional){
        System.out.println("Nacional");
        System.out.println("Nome-------" +nacional.getNome());
        System.out.println("Email-------" +nacional.getEmail());
        System.out.println("Fone-------" +nacional.getFone());
        System.out.println("CNPJ-------" +nacional.getCnpj());
        }
    
    public static void printFornercedorInteracional(Internacional internacional){
        System.out.println("Internacional");
        System.out.println("Nome-------" +internacional.getNome());
        System.out.println("Email-------" +internacional.getEmail());
        System.out.println("Fone-------" +internacional.getFone());
        System.out.println("Pais-------" +internacional.getPais());
        System.out.println("Nif-------" +internacional.getNif());
        }
}
