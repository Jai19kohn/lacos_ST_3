import java.util.Random;
import java.util.Scanner;

public class Sorteio2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o número que você quer chegar no sorteio:");
        int numeroFinal = scanner.nextInt();
        int numeroSorteado;
        int numeroSorteios = 0;
        String mensagemFinal;

        if(numeroFinal <1 || numeroFinal > 6){
            System.out.println("Erro! Escolha um número entre 1 a 6.");
        } else {
            do {
                numeroSorteios++;
                numeroSorteado = random.nextInt(1,7);
                System.out.printf("O numero sorteado foi o %d.\n", numeroSorteado);
            } while (numeroSorteado != numeroFinal);
            if (numeroSorteios == 1) {
                mensagemFinal = "Foi necessário %d sorteios para que o número %d fosse sorteado.";
            } else {
                mensagemFinal = "Foram necessários %d sorteios para que o número %d fosse sorteado.";
            }
            System.out.printf(mensagemFinal, numeroSorteios, numeroFinal);
        }
    }
}