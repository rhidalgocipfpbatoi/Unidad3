import java.util.Scanner;

public class Practica31 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int topeNota;

    public static int numeroNotas() {
        System.out.println("¿Cuántas notas vas a meter?");
        return scanner.nextInt();
    }

    public static double[] pedirNotas(int numNotasAPedir) {

        double[] notas = new double[numNotasAPedir];

        int i;
        // Introducir las notas
        for (i = 0; i < numNotasAPedir; i++) {
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

        topeNota = i;

        return notas;
    }

    public static void mostrarNotas(double[] notas) {
        // Mostrar las notas
        for (int j = 0; j < topeNota; j++) {
            System.out.println(notas[j]);
        }
    }

    public static void muestraMedia(double [] notas) {
        double suma = 0;
        for (int i = 0; i < topeNota; i++) {
            suma += notas[i];
        }

        double media = suma / topeNota;

        System.out.printf("La nota media es %.2f\n", media);
    }

    public static void muestraNotaMaxima(double [] notas) {
        double notaMaxima = Double.MIN_VALUE;

        for (int i = 0; i < topeNota; i++) {

            if (notas[i]>notaMaxima) {
                notaMaxima = notas[i];
            }
        }
        System.out.printf("La nota máxima es %.2f\n", notaMaxima);

    }

    public static void main(String[] args) {

        int numNotas = numeroNotas();
        double [] notas = pedirNotas(numNotas);
        mostrarNotas(notas);
        muestraMedia(notas);
        muestraNotaMaxima(notas);
    }
}
