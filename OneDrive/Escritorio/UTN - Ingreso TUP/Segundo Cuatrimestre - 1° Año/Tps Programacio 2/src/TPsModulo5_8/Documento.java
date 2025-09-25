/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_8;

/**
 *
 * @author ppasa
 */
public class Documento {
   
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; 

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        this.firmaDigital = new FirmaDigital(
            "HASH-" + titulo.hashCode(), 
            java.time.LocalDate.now().toString(), 
            usuario
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + 
               ", firmaDigital=" + firmaDigital + "]";
    }

}
