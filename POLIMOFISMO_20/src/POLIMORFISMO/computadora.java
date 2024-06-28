/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO;

/**
 *
 * @author Lab07
 */
// CLASE COMPUTADORA(HIJA)
public class computadora extends equipo {
    //ATRIBUTOS
    private String modelo;
    private int ram;

    //CONSTRUCTOR
    public computadora(String tipo, String modelo, int ram) {
        super(tipo);
        this.modelo = modelo;
        this.ram = ram;
    }

    //METODO
    public void mostrarDetalles() {
        System.out.println("Tipo de equipo: " + tipo);
        System.out.println("Modelo: " + modelo);
        System.out.println("RAM: " + ram + " GB");
    }
}