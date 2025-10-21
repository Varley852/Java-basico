package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite o nome do aluno: ");
       String nome = teclado.nextLine(); //declarando variável para receber entrada de dados
       System.out.print("Digite sua nota: ");
       float nota = teclado.nextFloat(); //declarando variável para receber entrada de dados
       //float nota = 8.5f; //Aqui estou declarando uma variável e, respectivamente atribuindo um valor a ela
        
       System.out.println("Sua nota é: " + nota);//Comando usado para saída de dados com quebra de linha
       System.out.print("Sua nota é: " + nota);//Comando usado para saída de dados
       System.out.printf("\nA nota de %s é: %.2f", nome, nota);//Comando usado para saída de dados com formatação
    }
}
