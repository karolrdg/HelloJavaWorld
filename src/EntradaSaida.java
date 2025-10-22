
import java.util.Scanner;

public class EntradaSaida {

    // 1️⃣ Método void que exibe uma saudação
    public static void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo ao sistema!");
    }

    // 2️⃣ Método que calcula o quadrado de um número
    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Chamando o método de saudação
        exibirMensagem(nome);

        // Solicitando um número inteiro
        System.out.print("Digite um número inteiro para calcular o quadrado: ");
        int numero = scanner.nextInt();

        // Chamando o método calcularQuadrado e exibindo o resultado
        int quadrado = calcularQuadrado(numero);
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }
}











//import java.util.Locale;
//import java.util.Scanner; // Importa a classe Scanner
//
//public class EntradaSaida {
//    public static void main(String[] args) {
//
//        // Cria o objeto Scanner para ler do teclado
//        Scanner scanner = new Scanner(System.in);
//
//        scanner.useLocale(Locale.US);
//
//
//        // Lendo um texto
//        System.out.print("Digite seu nome: ");
//        String nome = scanner.nextLine();
//
//        // Lendo um número inteiro
//        System.out.print("Digite sua idade: ");
//        int idade = scanner.nextInt();
//
//        // Lendo um número decimal
//        System.out.print("Digite sua altura (ex: 1.75): ");
//        double altura = scanner.nextDouble();
//
//        // Exibindo as informações
//        System.out.println("\n--- Dados Informados ---");
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade + " anos");
//        System.out.println("Altura: " + altura + " m");
//
//        // Fecha o scanner (boa prática)
//        scanner.close();
//    }
//}
//
