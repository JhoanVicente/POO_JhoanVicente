package control01_20;

public class Main_20_JhoanVicente {

    public static void main(String[] args) {
        Calculadora_20 cal = new Calculadora_20();
        
        //LLAMADA DE LOS METODOS JhoanVicente_20
        cal.ingresarDatosUsuario();        
        cal.sumarNumeros();
        cal.restarNumeros();
        cal.multiplicar();
        cal.dividir();
        
        //MOSTRAR LOS DATOS CON JOPTION
        cal.mostrarDatosUsuario();
    }
}