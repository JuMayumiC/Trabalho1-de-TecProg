
public class JogoAdivinhacao {

    public static void main(String[] args) {

        int secreto = 2;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");

        int encontrado = buscaBinaria(1, 1000, secreto);

        System.out.println("Número encontrado: " + encontrado);
    }

    public static int buscaBinaria(int inicio, int fim, int secreto) {

        // Calcula o meio do intervalo atual
        int meio = (inicio + fim) / 2;

        // CASO BASE: encontrou o número secreto
        if (meio == secreto) {
            System.out.println("Chute = " + meio + " -> Acertou!");
            return meio;
        }

        // PASSO RECURSIVO: procura na metade superior
        else if (meio < secreto) {
            System.out.println("Chute = " + meio + " -> Muito baixo");
            return buscaBinaria(meio + 1, fim, secreto);
        }

        // PASSO RECURSIVO: procura na metade inferior
        else {
            System.out.println("Chute = " + meio + " -> Muito alto");
            return buscaBinaria(inicio, meio - 1, secreto);
        }
    }
}
