import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definimos las variables para almacenar los datos
        String nombreVisitante; // Nombre del visitante
        byte cantidadVisitas; // Usamos byte para cantidad de visitas (días de la semana)
        int edadVisitante; // Edad del visitante (int)
        short horasEstadia, minutosEstadia; // Tiempo de estadía (en horas y minutos)
        long tiempoTotalEstadia = 0; // Tiempo total de estadía (en minutos)
        double tiempoPromedioEstadia; // Promedio del tiempo de estadía (en minutos)
        boolean esMayorEdad; // Determina si la persona es mayor de edad
        char primeraLetraNombre; // Usamos un char para la primera letra del nombre
        cantidadVisitas = 7; // La cantidad de visitas es 7 (una por cada día de la semana)

        // Solicitar el nombre del visitante
        System.out.println("Ingrese el nombre del visitante:");
        nombreVisitante = scanner.nextLine();

        // Solicitar la primera letra del nombre (usando char)
        primeraLetraNombre = nombreVisitante.charAt(0);

        // Solicitar la edad del visitante
        System.out.println("Ingrese la edad del visitante:");
        edadVisitante = scanner.nextInt(); // Leer la edad

        // Determinar si el visitante es mayor o menor de edad (usando boolean)
        esMayorEdad = edadVisitante >= 18;

        // Bucle para ingresar las visitas realizadas durante cada día de la semana
        for (byte dia = 1; dia <= cantidadVisitas; dia++) {
            System.out.println("\nDia #" + dia + " de la semana: ");
            // Solicitar las horas estimadas de estadía para el día actual
            System.out.println("Ingrese las horas estimadas de estadía en el día #" + dia + ":");
            horasEstadia = scanner.nextShort();

            // Solicitar los minutos estimados de estadía para el día actual
            System.out.println("Ingrese los minutos estimados de estadía en el día #" + dia + ":");
            minutosEstadia = scanner.nextShort();

            // Calcular el tiempo total de estadía en minutos para ese día
            tiempoTotalEstadia += (horasEstadia * 60) + minutosEstadia;
        }

        // Calcular el tiempo promedio de estadía (en minutos)
        tiempoPromedioEstadia = (double) tiempoTotalEstadia / cantidadVisitas;

        // Imprimir resultados
        System.out.println("\nResumen de visitas de " + nombreVisitante + ":");
        System.out.println("Cantidad total de visitas: " + cantidadVisitas);
        System.out.println("Tiempo total de estadía: " + tiempoTotalEstadia + " minutos");
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedioEstadia + " minutos");

        // Mostrar si el visitante es mayor o menor de edad
        if (esMayorEdad) {
            System.out.println("El visitante es mayor de edad.");
        } else {
            System.out.println("El visitante es menor de edad.");
        }

        // Mostrar la primera letra del nombre (char)
        System.out.println("La primera letra del nombre del visitante es: " + primeraLetraNombre);

        scanner.close(); // Cerrar el scanner
    }
}