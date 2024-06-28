/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO;

/**
 *
 * @author Lab07
 */
//CLASE PARLANTE(HIJA)
public class parlante extends equipo {
    
    //ATRIBUTOS
    private String marca;
    private boolean bluetooth;

    //CONSTRUCTOR
    public parlante(String tipo, String marca, boolean bluetooth) {
        super(tipo);
        this.marca = marca;
        this.bluetooth = bluetooth;
    }

    //METODOS
    public void mostrarDetalles() {
        System.out.println("Tipo de equipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Bluetooth: " + (bluetooth ? "Sí" : "No"));
    }
}
