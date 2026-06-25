
package estructuraswitch;

import java.util.Scanner;
public class EstructuraSwitch {


  public static void main(String[] args) {
/*Mini-proyecto integrador — if, else if, else y switch

Nombre: Sistema básico de recomendación de cursos

El programa debe mostrar un menú de cursos:

Programación
Diseño web
Base de datos

El usuario debe elegir una opción del menú.

Después el programa debe pedir su nivel de experiencia:

0 = Principiante
1 = Básico
2 = Intermedio

El programa debe recomendar algo según la opción elegida y el nivel.

Ejemplo de idea:

Si elige Programación y es principiante, recomendar “Fundamentos de programación”.
Si elige Diseño web y es básico, recomendar “HTML y CSS”.
Si elige Base de datos y es intermedio, recomendar “SQL avanzado”.
Si pone una opción incorrecta, mostrar “Opción inválida”.
Si pone un nivel incorrecto, mostrar “Nivel inválido”.

Objetivo: usar switch para elegir el curso y if / else if / else para decidir la recomendación según el nivel.*/
  

Scanner leer = new Scanner(System.in);

System.out.println("  Sistema básico de recomendación de cursos   ");
System.out.println("Escribe el curso el cual deseas inscribirte puede ser: Programacion, Diseno web, Base de datos");
String curso = leer.nextLine();
System.out.println("Escribe tu nivel de experiencia:Principiante,Basico,Intermedio");
String nivel = leer.nextLine();

if (curso.equalsIgnoreCase("Programacion")){
        switch(nivel){
        case "Principiante":
            System.out.println("Te recomiendo llevar Fundamentos de Programacion" );
            break;
        case "Basico":
            System.out.println("Te recomiendo llevar logica de programacion");
            break;
        case "Intermedio":
            System.out.println("Te recomiendo llevar un curso de un software");
            break;
        default:
            System.out.println("Nivel inválido");}
         
        }

else if (curso.equalsIgnoreCase("Diseno web")){
        switch(nivel){
        case "Principiante":
            System.out.println("Te recomiendo llevar fundamentos y logica de programacion" );
            break;
        case "Basico":
            System.out.println("Te recomiendo llevar clases de CSS Y HTML");
            break;
        case "Intermedio":
            System.out.println("Te recomiendo llevar un curso de Javascript");
            break;
        default:
            System.out.println("Nivel inválido");}}


else if (curso.equalsIgnoreCase("Base de datos")){
        switch(nivel){
        case "Principiante":
            System.out.println("Te recomiendo llevar Excel" );
            break;
        case "Basico":
            System.out.println("Te recomiendo llevar SQL");
            break;
        case "Intermedio":
            System.out.println("Te recomiendo llevar un curso de base de datos no relacionales");
            break;
        default:
            System.out.println("Nivel inválido");}}
   else {
         System.out.println("Opción inválida");        
        }


    }
    
    }            

    
    

   

  
