import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor inteiro maior que 0:");
        int valor = ler.nextInt();
        for(int i=1; i <= valor; i = i+2) {
            System.out.println(i);
        }
    }
}