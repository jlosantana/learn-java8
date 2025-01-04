import java.util.function.BiFunction;

public class Exemplo3 {

    // Criando uma interface funcional para multiplicar
    interface Multiplyer {
        int multiply(int a, int b);
    }

    public static void main(String[] args) throws Exception {
        // Criando um objeto da interface funcional e definindo a implementação
        Multiplyer multiplyer = (a, b) -> a * b;
        // Imprimindo o resultado
        System.out.println(multiplyer.multiply(2, 3));

        // O mesmo codigo pode ser feito usando as classes do pacote java.util.function
        // A interface BiFunction recebe dois parâmetros e retorna um valor
        BiFunction<Integer, Integer, Integer> multiplyer2 = (a, b) -> a * b;
        // Imprimindo o resultado
        System.out.println(multiplyer2.apply(2, 3));
        // O metodo apply possui esse nome generico, uma vez que posso multiplicar, 
        // somar, subtrair...
    }
}
