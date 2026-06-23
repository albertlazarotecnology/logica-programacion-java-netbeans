
package conversormonedas;


public class ConversorMonedas {

   
    public static void main(String[] args) {
            /*PROYECTO 2: CONVERSOR DE MONEDAS:
Crea un programa que tenga una cantidad en soles y la convierta a dólares y euros usando constantes para el tipo de cambio.

Debe mostrar: monto en soles, tipo de cambio usado, equivalente en dólares y equivalente en euros.*/
            
            double cantidadsoles, cantidaddolares, cantidadeuros;  final double tipodeCambioD = 0.3; final double tipodeCambioE = 3.88;
            
           cantidadsoles = 30; 
           cantidaddolares = cantidadsoles*tipodeCambioD;
           cantidadeuros = cantidadsoles/tipodeCambioE;
           
           System.out.println("     CONVERSOR DE MONEDAS" + "\nEl monto en soles es: "+cantidadsoles+" soles");
           System.out.println( "Los tipos de cambios son los siguientes: \nTipo de cambio en dólares, 1 sol = "+tipodeCambioD+" dólares");
           System.out.println( "Tipo de cambio en euros, 1 euro = "+ tipodeCambioE+" soles");
           System.out.println( "Por lo cual el monto en dólares seria: "+cantidaddolares+" dolares");
           System.out.println( "Por lo cual el monto en euros seria: " +String.format("%.2f",cantidadeuros)+" euros");
           
           
    }
    
}
