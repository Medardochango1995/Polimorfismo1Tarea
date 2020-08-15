/*
POLIMORFISMO 1 TAREA
 */
package scanner_seleccion_transmision;

/**
 *
 * @author USUARIO
 */


class Caja_cambios{
public void TransmitirPar(){
System.out.println("Newton metro");
}
}
class Manual extends Caja_cambios{
public void TransmitirPar(){
System.out.println("Embrague");
}
}
class Automatica extends Caja_cambios {
public void TransmitirPar(){
System.out.println("Convertidor Par");
}
}
class Robotizada extends Caja_cambios{
public void TransmitirPar(){
System.out.println("Control Electronico");
}
}
class Tiptronic extends Caja_cambios{
public void TransmitirPar(){
System.out.println("Doble embrague - Ecu");
}
}
public class Scanner_seleccion_transmision{

    public static void main(String[] args) {
        System.out.println("  **********UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE********** ");
         System.out.println("             ********PROGRAMACION******** ");
         System.out.println("\033[34m-Estudiante: Medardo Chango");
         System.out.println("**************************************************************");
         System.out.println("\033[31mPOLIMORFISMO 1 TAREA "); 
         System.out.println("");
    
        Caja_cambios Objeto1=new Manual();
        Caja_cambios Objeto2=new Automatica();
        Caja_cambios Objeto3=new Robotizada();
        Caja_cambios Objeto4=new Tiptronic();
        //Outputs "Embrague"
        System.out.println("\033[34m-Caja_cambios que utiliza pedal: Manual");
        Objeto1.TransmitirPar();

        //Outputs "Convertidor Par"
        System.out.println("\033[34m-Caja_cambios que utiliza presion: Automatica");
        Objeto2.TransmitirPar();
        //Outputs "Control Electronico"
        System.out.println("\033[34m-Caja_cambios que utiliza modulos: Robotizada");
        Objeto3.TransmitirPar();
        //Outputs "Doble embrague - Ecu"
        System.out.println("\033[34m-Caja_cambios que utiliza sistema manual y automatico: Tiptronic");
        Objeto4.TransmitirPar();
    }
    
}