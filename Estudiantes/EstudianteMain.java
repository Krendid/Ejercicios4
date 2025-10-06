package Estudiantes;

public class EstudianteMain {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Lucas";
        estudiante1.edad = 20;
        estudiante1.carrera = "Ingeniería";

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Marta";
        estudiante2.edad = 22;
        estudiante2.carrera = "Medicina";

        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Diego";
        estudiante3.edad = 19;
        estudiante3.carrera = "Arquitectura";

        System.out.println("Nombre del estudiante: " + estudiante1.nombre + " - Edad: " + estudiante1.edad + " - Estudia: " + estudiante1.carrera);
        System.out.println("Nombre del estudiante: " + estudiante2.nombre + " - Edad: " + estudiante2.edad + " - Estudia: " + estudiante2.carrera);
        System.out.println("Nombre del estudiante: " + estudiante3.nombre + " - Edad: " + estudiante3.edad + " - Estudia: " + estudiante3.carrera);
    }
}
