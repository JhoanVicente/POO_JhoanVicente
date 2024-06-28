
package POLIMORFISMO;

/**
 *
 * @author Lab07
 */
public class POLIMORFISMO_20 {
    public static void main(String[] args) {

        computadora miComputadora = new computadora("Computadora", "HP Pavilion", 8);
        
        miComputadora.mostrarTipo(); 
        
        miComputadora.mostrarDetalles();
        System.out.println();
        
        parlante misParlantes = new parlante("Parlante", "Sony", true);
        
        misParlantes.mostrarTipo(); 
        
        // METODO
        misParlantes.mostrarDetalles();
    }
}
