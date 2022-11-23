import java.util.Scanner;

public class escada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor inteiro maior que 0:");
        int valor = ler.nextInt();

        for (int i = 1; i <= valor; i++) {
            for (int ia = 1; ia <= i; ia ++) {
                System.out.print("#");

            }
            System.out.print("\n");
        }
    }
}