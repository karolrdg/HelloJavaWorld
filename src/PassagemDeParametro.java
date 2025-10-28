public class PassagemDeParametro {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Antes da função: " + x);
        modificaValor(x);
        System.out.println("Depois da função: " + x);
    }

    public static void modificaValor(int valor) {
        valor = 20;
        System.out.println("Dentro da função: " + valor);
    }


}
