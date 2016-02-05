/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
public class Historia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
/*TEST ESTADÍSTICAS
System.out.println("Vida = "+Vida);
System.out.println("Maná = "+Maná);
System.out.println("Aguante = "+Aguante);
System.out.println("Fuerza = "+Fuerza);
System.out.println("Destreza = "+Destreza);
System.out.println("Inteligencia = "+Inteligencia);
*/

//STRINGS
 String Nombre;
 String DecisiónNombre;
 String Lugar;
 String DecisiónLugar;
 String Clase;
 String DecisiónClase;
     
//INTS
 int Vida; Vida=20;
 int Maná; Maná=20;
 int Aguante; Aguante=20;
 int Experiencia = 0;
 int Fuerza; Fuerza=0;
 int Destreza; Destreza = 0;
 int Inteligencia; Inteligencia = 0;
     
//SCANNERS
 Scanner EscánerNombre = new Scanner (System.in);
 Scanner EscánerDecisiónNombre = new Scanner (System.in);
 Scanner EscánerLugar = new Scanner (System.in);
 Scanner EscánerDecisiónLugar = new Scanner (System.in);
 Scanner EscánerClase = new Scanner (System.in);
 Scanner EscánerDecisiónClase = new Scanner (System.in);
     
//NOMBRE
 System.out.println("¿Hola! Bienvenido a tu aventura. Vamos a empezar con unas pocas preguntas para definir a tu personaje.");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
 System.out.println("Primera pregunta:");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
 System.out.println("¿Cómo te llamas? (Introduce el nombre de tu personaje)");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
  Nombre = EscánerNombre.nextLine();

try {Thread.sleep (500);} catch (Exception Esperar){}

   System.out.println("Así que te llamas "+Nombre+". ¿Confirmar?");
   try {Thread.sleep (500);} catch (Exception Esperar){}
    System.out.println("Sí/No");
     DecisiónNombre=EscánerDecisiónNombre.next();          
      while ("No".equals(DecisiónNombre)) {
       System.out.println("Entonces, ¿cómo te llamas?");
        Nombre=EscánerNombre.nextLine();
         System.out.println("Así que te llamas "+Nombre+". ¿Cierto?");
          System.out.println("Sí/No");
           DecisiónNombre=EscánerDecisiónNombre.next();}
 
try {Thread.sleep (1000);} catch (Exception Esperar){}
       
//LUGAR
 System.out.println("Segunda pregunta:");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
 System.out.println("¿Dónde te criaste? (Según la opción que elijas tu personaje será más afín a un rol que a otro).");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
  System.out.println("En la corte. Viviendo como un noble.");
  try {Thread.sleep (500);} catch (Exception Esperar){}
  System.out.println("En un monasterio. Viviendo como un monje.");
  try {Thread.sleep (500);} catch (Exception Esperar){}
  System.out.println("En un bosque. Viviendo como un ermitaño.");
  try {Thread.sleep (500);} catch (Exception Esperar){}
  System.out.println("1 = Corte, 2 = Monasterio, 3 = Bosque");
   Lugar=EscánerLugar.next();  
    switch (Lugar) {
     case ("1"):
      Lugar = ("la corte");
       Fuerza=Fuerza+2;
       Destreza=Destreza+1;
       Inteligencia=Inteligencia-1;
    break;
     case ("2"):
      Lugar = ("un monasterio");
       Fuerza=Fuerza-1;
       Destreza=Destreza+1;
       Inteligencia=Inteligencia+2;
    break;
     case ("3"):
      Lugar = ("un bosque");
      Fuerza=Fuerza+1;
      Destreza=Destreza+2;
      Inteligencia=Inteligencia-1;
    break;
    }
    
try {Thread.sleep (500);} catch (Exception Esperar){}

 System.out.println("¿Así que te criaste en "+Lugar+"?");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Si/No");
  DecisiónLugar=EscánerDecisiónLugar.next();
   while ("No".equals (DecisiónLugar)){
    Fuerza=0;
    Destreza=0;
    Inteligencia=0;
    try {Thread.sleep (500);} catch (Exception Esperar){}
     System.out.println("Entonces, ¿dónde te criaste?");
     try {Thread.sleep (500);} catch (Exception Esperar){}
     System.out.println("1 = Corte, 2 = Monasterio, 3 = Bosque");
      Lugar=EscánerLugar.next();
     switch (Lugar) {
      case ("1"):
       Lugar = ("la corte");
        Fuerza=Fuerza+2;
        Destreza=Destreza+1;
        Inteligencia=Inteligencia-1;
     break;
      case ("2"):
       Lugar = ("el monasterio");
        Fuerza=Fuerza-1;
        Destreza=Destreza+1;
        Inteligencia=Inteligencia+2;
     break;
      case ("3"):
       Lugar = ("el bosque");
        Fuerza=Fuerza+1;
        Destreza=Destreza+2;
        Inteligencia=Inteligencia-1;
     break;
    }
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("¿Así que te criaste en "+Lugar+"?");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Si/No");
  DecisiónLugar=EscánerDecisiónLugar.next();
    }

try {Thread.sleep (1000);} catch (Exception Esperar){}

//CLASE
 System.out.println("Tercera pregunta:");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
 System.out.println("¿Cómo te criaste?");
 try {Thread.sleep (1000);} catch (Exception Esperar){}
 System.out.println("Como discípulo de espadachín. Aficionado al combate cuerpo a cuerpo.");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Como discípulo de mago. Fanático de las artes arcanas.");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Como discípulo de arquero. Entusiasta del combate con arcos.");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("1 = Espadachín, 2 = Mago, 3 = Arquero");
  Clase=EscánerClase.next();
   switch (Clase) {
    case ("1"):
     Clase = ("Espadachín");
      Vida=Vida+5;
   break;
    case ("2"):
     Clase = ("Mago");
      Maná=Maná+5;
   break;
    case ("3"):
     Clase = ("Arquero");
      Aguante=Aguante+5;
   break;
   }
   
try {Thread.sleep (500);} catch (Exception Esperar){}
   
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Así que te criaste como "+Clase+". ¿Confirmar?");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Si/No");
  DecisiónClase=EscánerDecisiónClase.next();
   while ("No".equals(DecisiónClase)) {
    Vida=20;
    Maná=20;
    Aguante=20;
    try {Thread.sleep (500);} catch (Exception Esperar){}
     System.out.println("Entonces, ¿cómo te criaste?");
     try {Thread.sleep (500);} catch (Exception Esperar){}
     System.out.println("1 = Espadachín, 2 = Mago, 3 = Arquero");
      Clase=EscánerClase.next();
       switch (Clase) {
        case ("1"):
         Clase = ("Espadachín");
          Vida=Vida+5;
       break;
        case ("2"):
         Clase = ("Mago");
          Maná=Maná+5;
       break;
        case ("3"):
         Clase = ("Arquero");
          Aguante=Aguante+5;
       break;
    }

try {Thread.sleep (500);} catch (Exception Esperar){}

 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Así que te criaste como discípulo de "+Clase+". ¿Confirmar?");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Sí/No");
  DecisiónClase=EscánerDecisiónClase.next();}

try {Thread.sleep (500);} catch (Exception Esperar){}

 System.out.println("Perfecto, ya hemos terminado con las preguntas. ¡Hora de empezar con tu aventura!");
 try {Thread.sleep (500);} catch (Exception Esperar){}
 System.out.println("Cargando...");
try {Thread.sleep (7500);} catch (Exception Esperar){}

//HISTORIA. Capítulo 1: Un nuevo amanecer.
System.out.println("Te despiertas, notas que algo ha cambiado, abres los ojos y miras a tu alrededor, efectivamente, no es tu casa, sin embargo te resulta extremadamente familiar... parece estás en una vieja cabaña hecha de madera.");
try {Thread.sleep (3500);} catch (Exception Esperar){}
System.out.println("Miras un poco más allá y ves a un chico sentado en una mesa comiendo.");
try {Thread.sleep (2000);} catch (Exception Esperar){}
System.out.println("No sabes cómo has llegado hasta aquí, intentas salir de la cama,  pero sientes un dolor terrible en la pierna, parece imposible llegar a moverse...");





    }
    }