/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPsModulo5_14;

/**
 *
 * @author ppasa
 */
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Corto Animado", 15);

        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }

}
