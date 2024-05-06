package control01_20;

import javax.swing.JOptionPane;

public class Calculadora_20 {
    
    
    //ATRITUTOS 20_JhoanVicente
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //METODOS 20_JhoanVicente
    public void restarNumeros(){
        resta = num1 - num2;   
    }
    
    public void sumarNumeros(){
        suma = num1 + num2;   
    }
    
    public void multiplicar(){
        multiplicacion = num1 * num2;
    }
    
    public void dividir(){
        division = num1 / num2;
    }
    
    //APLICACION DEL JOptionPane
    public void ingresarDatosUsuario(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo número"));
    }
    
    //MOSTRAR DATOS
    public void mostrarDatosUsuario(){
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta + "\n" + 
                                            "El resultado de la suma es: " + suma + "\n" + 
                                            "El resultado de la multiplicación es: " + multiplicacion + "\n" + 
                                            "El resultado de la división es: " + division);
        
    }
}