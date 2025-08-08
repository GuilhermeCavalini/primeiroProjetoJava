import java.util.Scanner;

public class Lweitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lancamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua avaliação para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
