public class HelloJavaWorld {

    public static void main(String[] args) {

// tipos de datos primitivos
        int numeroEntero = 10;
        double numeroDecimal = 10.5;
        char caracter = 'A';
        boolean esVerdadero = true;
        float numeroFlotante = 5.75f;
        long numeroLargo = 150000L;
        byte numeroByte = 100;
        short numeroCorto = 1000;
        String texto = "Hola, Mundo!";
        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Carácter: " + caracter);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Texto: " + texto);
        System.out.println(numeroFlotante);
        System.out.println(numeroLargo);
        System.out.println(numeroByte);
        System.out.println(numeroCorto);


        //vetores
        int[] numeros = {1, 2, 3, 4, 5};
        String[] frutas = {"Manzana", "Banana", "Cereza"};
        System.out.println("Primer número: " + numeros[1]);
        System.out.println("Segunda fruta: " + frutas[1]);

        int[] numeros2 = {10, 20, 30, 40, 50};

        System.out.println("Primeiro número: " + numeros2[0]);
        System.out.println("Último número: " + numeros2[3]);

        int[] numeros3 = {5, 10, 15, 20, 25, 30};

        for (int i = 2; i < numeros3.length; i++) {
            System.out.println("Posição " + i + ": " + numeros3[i]);
        }

//        double[] notas = {7.5, 8.0, 9.2, 6.8};
//        double soma = 0;
//
//        for (double nota : notas) {
//            soma += nota;
//        }
//
//        double media = soma / notas.length;
//        System.out.println("Média: " + media);



                int[] notas = {8, 7, 9}; // vetor fixo
                int soma = 0;

                for (int nota : notas) {
                    soma += nota;
                }

                int media = soma / notas.length;
                System.out.println("Média: " + media);





    }
}

