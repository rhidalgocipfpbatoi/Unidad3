import java.util.Scanner;

public class Practica31 {

    public static void main(String[] args) {

        // Pedir el número de notas por teclado
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Cuántas notas vas a meter?");
        int numNotas = scanner.nextInt();

        double[] notas = new double[numNotas];

        // Introducir las notas
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Introduce la nota " + (i+1));
            notas[i] = scanner.nextDouble();
            if (notas[i] > 10 || notas[i] < 0) {
                System.out.println("Error, nota incorrecta");
                i--;
            }
        }

        // Mostrar las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
