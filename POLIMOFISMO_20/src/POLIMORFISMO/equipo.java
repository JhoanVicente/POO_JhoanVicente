
package POLIMORFISMO;

/**
 *
 * @author Lab07
 */
// CLASE EQUIPO(PADRE)
public class equipo {
    
    //ATRIBUTO
    protected String tipo;

    //CONSTRUCTOR
    public equipo(String tipo) {
        this.tipo = tipo;
    }

    //METODO
    public void mostrarTipo() {
        System.out.println("Tipo de equipo: " + tipo);
    }
}
