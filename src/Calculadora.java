import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
                while (escolha != 3) {
                    System.out.println("----MENU-----");
                    System.out.println("-----Menu-----");
                    System.out.println("1. Calcular área do quadrado");
                    System.out.println("2. Calcular área do círculo");
                    System.out.println("3. Sair");
                    System.out.print("Escolha uma opção: ");
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.println("Digite o valor do quadrado: ");
                        double lado = scanner.nextDouble();
                        double area = lado * lado;
                        System.out.println("Área do quadrado: " + area);
                    }
                    else if (escolha == 2) {
                        System.out.println("Digite o raio do círculo: ");
                        double raio = scanner.nextDouble();
                        double areaDoCirculo = 3.14 * raio * raio;
                        System.out.println("Área do círculo: " + areaDoCirculo);
                    }
                    else if (escolha == 3) {
                        System.out.println("Programa encerrado!");
                    }
                    else {
                        System.out.println("Opção inválida. Tente novamente entre 1, 2, 3");
                    }
                }

    }
}
