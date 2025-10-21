package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        
        /*int idade = 21;
        String valor = Integer.toString(idade); 
//Uso a classe involucro do inteiro juntamente com o método "toString" para fazer a conversão
        System.out.println(valor);
        */
        
        /*!String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f ",idade);
    }
    
}
