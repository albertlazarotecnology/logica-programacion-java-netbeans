
package practicavariables;


public class PracticaVariables {

 
    public static void main(String[] args) {
       //1.- Boleta simple de venta
       
     String nombredelcliente, Nombredelatienda,nombredelproducto; int cantidad; double preciounitario,subtotal,total;
     
        Nombredelatienda = "     Mi_tienda";
        nombredelcliente = "Juan";
        nombredelproducto = "pan";
        cantidad = 26;
        preciounitario = 0.2;
        subtotal = cantidad*preciounitario;
        total = subtotal + 0.18*subtotal;
        
        
        System.out.println(   Nombredelatienda +"\nBOLETA SIMPLE DE VENTA");
        System.out.println("Nombre del cliente:" + nombredelcliente);
        System.out.println("Nombre del producto que lleva: " + nombredelproducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario del producto: " + preciounitario +  " soles");
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("IGV:18% o 0.18");
        System.out.println("Total a pagar: "+ total + " soles");
        
                
        
        
        
        
        
    }
    
}
