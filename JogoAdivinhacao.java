
public class JogoAdivinhacao {

    public static void main(String[] args) {

        // Define o número secreto
        int secreto = 13;

        // Cria um array para contar as tentativas
        int[] tentativas = new int[1];

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Número secreto no intervalo [1, 1000].");
        System.out.println();

        // Inicia a busca binária recursiva
        int encontrado = buscaBinaria(1, 1000, secreto, tentativas);

        // Exibe o resultado final
        System.out.println();
        System.out.println("O número secreto era " + encontrado + ".");
        System.out.println("Total de tentativas: " + tentativas[0]);
    }

    public static int buscaBinaria(int inicio, int fim,
                                    int secreto, int[] tentativas) {

        // Calcula o ponto médio do intervalo
        int meio = (inicio + fim) / 2;

        // Registra uma nova tentativa
        tentativas[0]++;

        // CASO BASE: o número foi encontrado
        if (meio == secreto) {
            System.out.println("Tentativa " + tentativas[0]
                    + ": chute = " + meio + " -> Acertou!");
            return meio;
        }

        // PASSO RECURSIVO: procura na metade superior
        else if (meio < secreto) {
            System.out.println("Tentativa " + tentativas[0]
                    + ": chute = " + meio + " -> Muito baixo");

            return buscaBinaria(meio + 1, fim, secreto, tentativas);
        }

        // PASSO RECURSIVO: procura na metade inferior
        else {
            System.out.println("Tentativa " + tentativas[0]
                    + ": chute = " + meio + " -> Muito alto");

            return buscaBinaria(inicio, meio - 1, secreto, tentativas);
        }
    }
}
