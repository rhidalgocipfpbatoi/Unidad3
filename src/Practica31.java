import java.util.Scanner;

public class Practica31 {

    public static void main(String[] args) {

        // Pedir el número de notas por teclado
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Cuántas notas vas a meter?");
        int numNotas = scanner.nextInt();

        double[] notas = new double[numNotas];

        int i;
        // Introducir las notas
        for (i = 0; i < numNotas; i++) {
            System.out.println("Introduce la nota " + (i+1));
            notas[i] = scanner.nextDouble();
            if (notas[i] > 10 || notas[i] < 0) {
                if (notas[i] == -1) {
                    break;
                } else {
                    System.out.println("Error, nota incorrecta");
                    i--;
                }
            }
        }

        // Mostrar las notas
        for (int j = 0; j < i; j++) {
            System.out.println(notas[j]);
        }
    }
}
