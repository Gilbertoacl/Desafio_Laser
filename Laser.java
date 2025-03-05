import java.util.Scanner;

public class Laser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int altura = scanner.nextInt();
            int comprimento = scanner.nextInt();

            if (altura == 0 && comprimento == 0) {
                break;
            }

            int[] alturas = new int[comprimento];
            for (int i = 0; i < comprimento; i++) {
                alturas[i] = scanner.nextInt();
            }


            int ativacoes = 0;
            int alturaAtual = altura;

            for (int i = 0; i < comprimento; i++) {
                if (alturas[i] < alturaAtual) {
                    ativacoes += (alturaAtual - alturas[i]);
                }
                alturaAtual = alturas[i];
            }

            System.out.println(ativacoes);
        }

        scanner.close();
    }
}