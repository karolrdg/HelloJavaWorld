public class AtividadePratica {

        public static void main(String[] args) {

            // Declaração de variáveis primitivas
            int numero = 20;
            double preco = 10.50;
            boolean boo = false;
            char letra = 'A';
            float flutuante = 5.75f;
            long grandeNumero = 150000L;
            byte pequenoNumero = 100;
            short numeroCurto = 1000;

            System.out.println("Número: " + numero);
            System.out.println("Preço: " + preco);
            System.out.println("Booleano: " + boo);
            System.out.println("Caractere: " + letra);
            System.out.println("Número Flutuante: " + flutuante);
            System.out.println("Número Longo: " + grandeNumero);
            System.out.println("Número Byte: " + pequenoNumero);
            System.out.println("Número Curto: " + numeroCurto);

            // Estrutura de controle de fluxo (if-else)
            if (numero > 5) {
                System.out.println("O valor é maior que 5.");
            } else {
                System.out.println("O valor é 5 ou menor.");
            }

            // Estrutura de repetição (for loop)
            for (int i = 0; i < 11; i++) {
                System.out.println("Número de iterações " + i);
            }

            // Tratamento de exceção
            try {
                int resultado = numero / 5; // Provocando uma exceção (divisão por zero)
                System.out.println("O resultado é: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }

            // Manipulação de array (vetor)
            int[] numeros = {4, 8, 15, 16, 23, 42};
            for (int n : numeros) {
                System.out.println("Número do array: " + n);
            }
            // Exemplo de matriz (array bidimensional)
            int[][] matriz = {
                    {10, 20, 30},
                    {40, 50, 60},
                    {70, 80, 90}
            };

            // Imprimindo a matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

