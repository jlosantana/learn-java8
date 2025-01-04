public class Exemplo4 {

    // Criando uma interface funcional para multiplicar
    interface Multiplicador {
        int multiplicar(int a, int b);
    }

    // Criando uma interface funcional para formatar que recebe uma função como parametro
    interface Formatador {
        String formatar(Multiplicador m, String messaeString);
    }
    // Uma função de alta ordem é uma função que atende a pelo menos uma das seguintes condições:
    // - Recebe outra função como argumento.
    // - Retorna uma função como resultado.

    public static void main(String[] args) {
        // Criando um objeto da interface funcional e definindo a implementação
        Multiplicador multiplicador = (a, b) -> a * b;
        // Criando um objeto formatador e definindo a implementação
        Formatador formatador = (m, messaeString) -> messaeString + m.multiplicar(2, 3);
        // Imprimindo o resultado
        System.out.println(formatador.formatar(multiplicador, "O resultado é: "));    
    }
}
