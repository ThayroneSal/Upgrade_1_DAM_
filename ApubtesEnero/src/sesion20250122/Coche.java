package sesion20250122;

import java.util.Scanner;

// Ejemplo de como crear un objeto.

public class Coche {

// Lo prinero que solemos hacer es declarar que atributo va a usar nuestra clase.

private String marca;
private String modelo;
private int velocidad;

// ahora voy a crear el constructor de la clase. Esto es lo que de verdad me permite crear el objetos.

public Coche(String marca, String modelo ){ // Vamos a suponer que por defecto un coche está quieto.
this.marca = marca;
this.modelo = modelo;
this.velocidad = 0;
    }

    // Los getters nos ayudan a obtener el valor de los atributos de la clase.

public String getMarca(){
 return marca;

}
public String getModelo(){
    return modelo;

   }
   public int getVelocidad(){
    return velocidad;

   }

// Setters, ayudan a modificar el valor en memoria de los atributos de objeto.

public void setMarca(String marca){
 this.marca = marca;

}

public void setModelo(String modelo){
    this.modelo = modelo;

   }

   public void setVelocidad(int velocidad){

    if (velocidad >= 0){
        this.velocidad = velocidad;
    
    } else {
        System.out.println("La velocidad no puede ser negativa, por lo que no se ha cambiado la velocidad");
    }
    //this.velocidad = velocidad;

   }

   public void acelerar(int incremento){

    if (incremento>0){

    velocidad += incremento;
    System.out.println("El coche ahora va más rapido. Su velocidad actual es de " + velocidad + " km/h");

    } else {
        System.out.println("el incremento debe ser positivo, por lo que no ha cambiado la velocidad al intentar acelerar ");
    
    }

   }
   /**
    * Reduce la velocidad del coche en una cantidad especifica.
    * @param decremento decremento la cantidad de km/h a reducir (debe ser un n'umero positivo)
    */

   public void frenar (int decremento){

    if (decremento > 0 && velocidad - decremento >= 0){

        velocidad -= decremento;
        System.out.println("El coche ahora va más lento. Su velocidad actual es de " + velocidad + " km/h");
    
        } else if(decremento >0){
            
            System.out.println("La velocidad no puede quedar en número negativo)");
            
        }else {
            System.out.println("el decremento debe ser un número positivo, por lo que no ha cambiado la velocidad al intentar frenar ");
        
        }

   }

   public static void main(String[] args) {
    //crearemos un coche de ejemplo.

    Scanner scanner = new Scanner(System.in);

    Coche miCoche = new Coche ("kIA", "Ceed");

      System.out.println(" Mi coche es un " + miCoche.getMarca() + " " + miCoche.getModelo() + " y va a " + miCoche.getVelocidad() + " km/h");

      miCoche.setVelocidad(100);

      System.out.println("Mi coche va a " + miCoche.getVelocidad() + " km/h");

      miCoche.frenar(40);
   }

}
