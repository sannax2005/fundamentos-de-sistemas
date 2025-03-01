package Matricula;

import java.util.Scanner;

public class CursoAdminInformacion {

    // Variables globales para el curso
    static String cursoNombre = "Administración de la Información";
    static String cursoCodigo = "ADI-001";
    static String programa = "Tecnología en Sistemas de Información y de Software";
    static String cursoDuracion = "1 Semestre";
    static int cuposDisponibles = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar matrícula del curso
        System.out.println("Por favor, ingrese el codigo del curso que desea matricular:");
        String matricula = scanner.nextLine();

        // Validar matrícula
        if (esMatriculaValida(matricula)) {
            System.out.println("Matrícula válida.");
            // Verificar disponibilidad de cupos
            if (cuposDisponibles > 0) {
                // Realizar inscripción
                cuposDisponibles--; // Reducir los cupos disponibles
                System.out.println("¡Inscripción exitosa!");
                System.out.println("Curso: " + cursoNombre);
                System.out.println("Programa: " + programa);
                System.out.println("Código: " + cursoCodigo);
                System.out.println("Duración: " + cursoDuracion);
                System.out.println("Cupos disponibles: " + cuposDisponibles);
            } else {
                System.out.println("Lo sentimos, no hay cupos disponibles para este curso.");
            }
        } else {
            System.out.println("Matrícula inválida. Por favor, intente nuevamente.");
        }

        scanner.close();
    }

    // Método para verificar la validez de la matrícula
    public static boolean esMatriculaValida(String matricula) {
        return matricula.matches("ADI-\\d{3}");
    }
}
