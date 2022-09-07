package anatomia.classes;


public class Introducao {
    public static void main(String [] args){
        String primeiroNome = "Pablo";
        String segundoNome = "Henrique SC";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
