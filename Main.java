/**Programa que simula la creación de una facultad, carreras, ciclos y asignaturas
 * Desarrollado durante clases por segundo ciclo paralelo "A"
 */

import mallaCurricular.*;

public class Main {
    public static void main(String[] args) {
        Facultad facultad = new Facultad("Facultad de Energía", "FEIRNNR"); // Insta
        Carrera computacion = new Carrera("111", "Computación",
                "Ingeniero en computacion", facultad, Modalidad.PRESENCIAL);
        facultad.getCarreraList().add(computacion);
        facultad.getCarreraList().add(new Carrera("124", "Electronica",
                "Ingeniero en electronica", facultad, Modalidad.PRESENCIAL));

       computacion.crearCiclos(9);
       computacion.crearAsignatura(2, "Programacio Orientada a Objetos");
       computacion.crearAsignatura(2, "Análisis matemático");
       computacion.crearAsignatura(2, "Diseño de circuitos");
       computacion.crearAsignatura(2, "Emprendimiento e Innovacion Tecnologica");
       computacion.crearAsignatura(2, "Teoria de la distribución y la probabilidad");
       System.out.println(facultad);
    }
}