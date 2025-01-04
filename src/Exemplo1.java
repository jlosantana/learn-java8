/**
 * Aplicação de exemplo para estudo de lambdas e interface funcional
 */
public class Exemplo1 {

    // Criando uma interface funcional para multiplicar
    interface Multiplyer {
        int multiply(int a, int b);
    }
    public static void main(String[] args) throws Exception {
        // Criando um objeto da interface funcional e definindo a implementação
        Multiplyer multiplyer = (a, b) -> a * b;
        // Imprimindo o resultado
        System.out.println(multiplyer.multiply(2, 3));
    }
}
