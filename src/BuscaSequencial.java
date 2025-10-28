public class BuscaSequencial {
//busca sequencial em um array
    public static int busca(int[] array, int valorProcurado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorProcurado) {
                return i; // Retorna o índice se o valor for encontrado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}

//Exemplo de uso
class Main {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 4, 9, 1};
        int valorProcurado = 4;
        int indice = BuscaSequencial.busca(numeros, valorProcurado);
        if (indice != -1) {
            System.out.println("Valor encontrado no índice: " + indice);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}