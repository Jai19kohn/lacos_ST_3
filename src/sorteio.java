import java.util.Random;
import java.util.Scanner;

public class sorteio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a quantidade de sorteios:");
        int quantSorteios = scanner.nextInt();
        int total = 0;

        for(int i = 0; i < quantSorteios; i++){
            int sorteio = random.nextInt(1,7);

            total += sorteio;
            System.out.printf("o numero %d sorteado foi!\n", sorteio);
        }
        System.out.printf("A soma dos números sorteados é %d", total);
    }
}