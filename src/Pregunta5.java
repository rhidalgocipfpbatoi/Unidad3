public class Pregunta5 {
    public static void main(String[] args) {
        double []diez = new double[10];
        diez[diez.length - 1] = 5.5;
        System.out.println(diez[0] + diez[1]);

        // Suma de los elementos del array
        double suma = 0;
        for (int i = 0; i < diez.length; i++) {
            suma += diez[i];
        }
        System.out.println("El sumatorio es " + suma);

        // Obtiene el mínimo elemento del array
        double minimo = Double.MAX_VALUE;

        for (int i = 0; i < diez.length; i++) {
            if (diez[i] < minimo) {
                minimo = diez[i];
            }
        }


    }
}
