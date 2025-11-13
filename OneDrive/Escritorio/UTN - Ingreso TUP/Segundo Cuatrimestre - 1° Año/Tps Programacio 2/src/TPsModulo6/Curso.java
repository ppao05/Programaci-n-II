/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo6;

/**
 *
 * @author ppasa
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;   // Profesor responsable (puede ser null)

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * setProfesor mantiene la relación bidireccional consistente:
     * - Saca el curso del profesor anterior (si había).
     * - Asigna el nuevo profesor.
     * - Agrega el curso a la lista del nuevo profesor (si no estaba).
     */
    public void setProfesor(Profesor p) {
        // Si es el mismo profesor, no hay nada que hacer
        if (this.profesor == p) {
            return;
        }

        // 1) Si tenía profesor anterior, me quito de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        // 2) Asigno el nuevo profesor
        this.profesor = p;

        // 3) Me agrego a la lista del nuevo profesor, si no estoy
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null)
                ? profesor.getNombre()
                : "Sin profesor asignado";

        System.out.println("Curso código: " + codigo +
                " | Nombre: " + nombre +
                " | Profesor: " + nombreProfesor);
    }
}


