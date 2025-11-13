/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */
public class MainUniversidad {

    public static void main(String[] args) {

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("P001", "Ana Gómez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P003", "Laura Díaz", "Estadística");

        Curso c1 = new Curso("CURS001", "Álgebra I");
        Curso c2 = new Curso("CURS002", "Programación I");
        Curso c3 = new Curso("CURS003", "Probabilidad y Estadística");
        Curso c4 = new Curso("CURS004", "Estructuras de Datos");
        Curso c5 = new Curso("CURS005", "Análisis Matemático");

        // 2. Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("Universidad Nacional");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
        uni.asignarProfesorACurso("CURS001", "P001"); // Álgebra I - Ana
        uni.asignarProfesorACurso("CURS005", "P001"); // Análisis Matemático - Ana

        uni.asignarProfesorACurso("CURS002", "P002"); // Programación I - Carlos
        uni.asignarProfesorACurso("CURS004", "P002"); // Estructuras de Datos - Carlos

        uni.asignarProfesorACurso("CURS003", "P003"); // Prob. y Estadística - Laura

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n---- 4) Listar cursos con su profesor ----");
        uni.listarCursos();

        System.out.println("\n---- 4) Listar profesores con sus cursos ----");
        uni.listarProfesores();
        System.out.println();
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();

        // 5. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n---- 5) Cambiar profesor de CURS001 a P003 ----");
        uni.asignarProfesorACurso("CURS001", "P003");

        System.out.println("Cursos del profesor Ana luego del cambio:");
        prof1.listarCursos();
        System.out.println("Cursos del profesor Laura luego del cambio:");
        prof3.listarCursos();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n---- 6) Eliminar curso CURS004 ----");
        boolean eliminadoCurso = uni.eliminarCurso("CURS004");
        System.out.println("Curso eliminado: " + eliminadoCurso);

        System.out.println("Cursos del profesor Carlos después de eliminar CURS004:");
        prof2.listarCursos();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("\n---- 7) Eliminar profesor P002 ----");
        boolean eliminadoProfesor = uni.eliminarProfesor("P002");
        System.out.println("Profesor eliminado: " + eliminadoProfesor);

        System.out.println("Cursos luego de eliminar al profesor P002:");
        uni.listarCursos();  // Los cursos que dictaba P002 deben mostrar "Sin profesor asignado"

        // 8. Mostrar reporte: cantidad de cursos por profesor.
        System.out.println("\n---- 8) Reporte: cantidad de cursos por profesor ----");
        uni.reporteCursosPorProfesor();
    }
}


