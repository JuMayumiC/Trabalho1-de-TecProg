
public class JogoAdivinhacao {

    public static void main(String[] args) {

        int secreto = 500;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");

        testarMeio(1, 1000, secreto);
    }

    public static void testarMeio(int inicio, int fim, int secreto) {

        int meio = (inicio + fim) / 2;

        if (meio == secreto) {
            System.out.println("Chute = " + meio + " -> Acertou!");
        }
        else if (meio < secreto) {
            System.out.println("Chute = " + meio + " -> Muito baixo");
        }
        else {
            System.out.println("Chute = " + meio + " -> Muito alto");
        }
    }
}
