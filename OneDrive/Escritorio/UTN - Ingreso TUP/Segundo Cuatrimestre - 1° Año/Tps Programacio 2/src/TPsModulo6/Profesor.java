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

public class Profesor {
    

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Agrega curso sincronizando el otro lado
    public void agregarCurso(Curso c) {
        if (c == null) return;
        // Dejo que setProfesor maneje ambas listas
        c.setProfesor(this);
    }

    // Elimina curso sincronizando el otro lado
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no tiene cursos asignados.");
            return;
        }
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id +
                " | Nombre: " + nombre +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }
}


