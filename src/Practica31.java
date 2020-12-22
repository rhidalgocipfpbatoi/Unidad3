import java.util.Scanner;

public class Practica31 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int topeNota;
    private static final int SUSPENSO = 0;
    private static final int APROBADO = 1;
    private static final int NOTABLE = 2;
    private static final int EXCELENTE = 3;

    public static int numeroNotas() {
        System.out.println("¿Cuántas notas vas a meter?");
        return scanner.nextInt();
    }

    public static double[] pedirNotas(int numNotasAPedir) {

        double[] notas = new double[numNotasAPedir];

        int i;
        // Introducir las notas
        for (i = 0; i < numNotasAPedir; i++) {
            System.out.println("Introduce la nota " + (i + 1));
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

    public static void muestraMedia(double[] notas) {
        double suma = 0;
        for (int i = 0; i < topeNota; i++) {
            suma += notas[i];
        }

        double media = suma / topeNota;

        System.out.printf("La nota media es %.2f\n", media);
    }

    public static void muestraNotaMaxima(double[] notas) {
        double notaMaxima = Double.MIN_VALUE;

        for (int i = 0; i < topeNota; i++) {

            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }
        System.out.printf("La nota máxima es %.2f\n", notaMaxima);

    }

    public static void buscarNota(double[] notas) {

        System.out.println("¿Qué nota quieres buscar?");
        double notaABuscar = scanner.nextDouble();

        for (int i = 0; i < topeNota; i++) {
            if (notaABuscar == notas[i]) {
                System.out.println("La nota está en la posición " + (i + 1));
                return;
            }
        }

        System.out.printf("La nota %.2f no existe", notaABuscar);
    }

    public static int[] resumenCalificaciones(double[] notas) {
        int[] resumenCalificaciones = new int[4];

        for (int i = 0; i < topeNota; i++) {
            if (notas[i] >= 0 && notas[i] < 5) {
                resumenCalificaciones[SUSPENSO]++;
            } else if (notas[i] >= 5 && notas[i] < 7) {
                resumenCalificaciones[APROBADO]++;
            } else if (notas[i] >= 7 && notas[i] < 9) {
                resumenCalificaciones[NOTABLE]++;
            } else {
                resumenCalificaciones[EXCELENTE]++;
            }
        }

        return resumenCalificaciones;
    }

    public static void muestraResultado(
            int[] calificaciones,
            String tituloResultado, int idCalificacion) {

        System.out.println(tituloResultado);
        for (int i = 0; i < calificaciones[idCalificacion]; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void muestraGraficaNotas(double[] notas) {

        int[] calificaciones = resumenCalificaciones(notas);

        System.out.println("Gráfico de barras de las notas");
        System.out.println("------------------------------");

        muestraResultado(calificaciones, "Suspendidos", SUSPENSO);
        muestraResultado(calificaciones, "Aprobados", APROBADO);
        muestraResultado(calificaciones, "Notables", NOTABLE);
        muestraResultado(calificaciones, "Excelentes", EXCELENTE);
    }

    public static void main(String[] args) {

        int numNotas = numeroNotas();
        double[] notas = pedirNotas(numNotas);
        mostrarNotas(notas);
        muestraMedia(notas);
        muestraNotaMaxima(notas);
        //buscarNota(notas);
        muestraGraficaNotas(notas);
    }
}
