public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean incluidoNoPlano = true;
        double media = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2024) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrõ que vale a pena assistir!");
        }

        if (incluidoNoPlano= true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else  {
            System.out.println("Filme nao liberado, incluido no plano Plus");
        }
    }
}
