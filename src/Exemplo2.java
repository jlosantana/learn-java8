/**
 * Exemplo de uso de lambdas
 */
public class Exemplo2 {

    public static void main(String[] args) {
        // Usando uma classe anônima
        Runnable runAnonima = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable anonima");
            }
        };
    
        // Usando uma lambda
        Runnable runLambda = () -> System.out.println("Runnable lambda");
        
        runAnonima.run();
        runLambda.run();
    }
}
