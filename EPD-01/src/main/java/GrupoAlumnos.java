
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sergio
 */
public class GrupoAlumnos extends ArrayList<IAlumno> implements IGrupoAlumnos {

    private static Collection<IAlumno> coleccion;

    public GrupoAlumnos() {
        super();
        coleccion = new ArrayList<>();
    }

    public static IGrupoAlumnos obtenerGrupoPrueba() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Creación de Grupo de Prueba ---");
        System.out.print("¿Cuántos alumnos deseas añadir al grupo?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nDatos para el alumno " + i + ":");
            System.out.print("Introduce el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce los apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("Introduce el DNI: ");
            String dni = scanner.nextLine();

            IAlumno nuevoAlumno = new Alumno(nombre, apellidos, dni);

            coleccion.add(nuevoAlumno);
        }

        System.out.println("\n¡Grupo de prueba creado con éxito!");

        System.out.println("\nMostrando alumnos con Iterator:");
        Iterator<IAlumno> it = coleccion.iterator();
        while (it.hasNext()) {
            IAlumno a = it.next();
            System.out.println("- " + a.getNombre() + " " + a.getApellidos() + " (DNI: " + a.getDni() + ")");
        }

        IGrupoAlumnos g = new GrupoAlumnos();
        g.addAll(coleccion);
        
        return g;
    }

}
