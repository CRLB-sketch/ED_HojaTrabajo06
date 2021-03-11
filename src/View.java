/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> View (Clase tipo "Vista")</h2>
 * 
 * Operaciones con mapas
 * 
 * Para tener toda la interacción del usuario.
 * 
 * <p>
 * Algoritmos y Estructuras de datos - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Oscar Estrada]
 * @version 1.0
 * @since 2021-Marzo-11
 **/    

import java.util.Scanner;
 
public class View {
    
    // --> Atributos
    private Scanner scan;

    // --> Constructor 
    public View(){
        scan = new Scanner(System.in);
    }

    // --> Métodos
    public String mainMenu(){
        System.out.println("Menú principal: ");
        System.out.println("1. Agregar un producto a la colección del usuario.");
        System.out.println("2. Mostrar la categoría del producto.");
        System.out.println("3. Mostrar los datos del producto.");
        System.out.println("4. Mostrar los datos del producto (Ordenadas por tipo).");
        System.out.println("5. Mostrar el producto y la categoría de todo el inventario.");
        System.out.println("6. Mostrar el producto y la categoría existentes (ordenadas por tipo).");
        System.out.println("7. Salir");

        String op = scan.nextLine();
        return op;
    }
    
    public void invalid(){
        System.out.println("--> Opción Inválida");
    }

    public void farewell(){
        System.out.println("--> Salinedo...");
    }

    public void dialogueTest(String information){
        System.out.println(information);
    }
}
