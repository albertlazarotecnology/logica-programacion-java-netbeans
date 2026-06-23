
package calculadorapromedionotas;


public class CalculadoraPromedioNotas {

 
    public static void main(String[] args) {
      
        /*3. Calculadora de promedio de notas

Crea un programa que almacene el nombre de un estudiante y tres notas.

Debe calcular el promedio final y mostrar un resumen con:

nombre del estudiante, nota 1, nota 2, nota 3 y promedio final */
        
        String nombreestudiante; double nota1,nota2,nota3,promediofinal;
        
        nombreestudiante = "Juan Lázaro";
        nota1 = 17;
        nota2 = 13;
        nota3 = 11;
        promediofinal = ((nota1+nota2+nota3)/3);
        
        System.out.println("  Resumen de notas del alumno");
        System.out.println("Nombre y apellido del alumno: "+nombreestudiante);
        System.out.println("nota 1: "+nota1+"\nnota 2: "+nota2+"\nnota 3: "+nota3+"\nPromedio final: "+String.format("%.2f",promediofinal));
       

    }
}