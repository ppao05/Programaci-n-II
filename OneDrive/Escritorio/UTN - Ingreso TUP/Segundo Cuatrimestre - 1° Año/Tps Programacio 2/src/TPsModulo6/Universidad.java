/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores en la universidad.");
            return;
        }
        System.out.println("Profesores de la universidad \"" + nombre + "\":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos en la universidad.");
            return;
        }
        System.out.println("Cursos de la universidad \"" + nombre + "\":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Usa setProfesor del curso (cumpliendo el invariante de asociación)
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("No se encontró el curso con código: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("No se encontró el profesor con id: " + idProfesor);
            return;
        }

        curso.setProfesor(profesor);
        System.out.println("Profesor " + profesor.getNombre() +
                " asignado al curso " + curso.getNombre());
    }

    // Eliminar curso: romper relación con profesor si existe
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso == null) {
            return false;
        }

        // Rompemos la relación bidireccional
        curso.setProfesor(null);

        return cursos.remove(curso);
    }

    // Eliminar profesor: dejar profesor = null en todos sus cursos
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor == null) {
            return false;
        }

        // Para cada curso, si lo dictaba este profesor, lo dejamos sin profesor
        for (Curso c : cursos) {
            if (c.getProfesor() == profesor) {
                c.setProfesor(null);
            }
        }

        return profesores.remove(profesor);
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores para generar reporte.");
            return;
        }
        System.out.println("===== REPORTE: Cantidad de cursos por profesor =====");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " curso(s)");
        }
    }
}


