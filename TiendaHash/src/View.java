/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> View (Clase tipo "Vista")</h2>
 * 
 * Operaciones con mapas
 * 
 * Para tener toda la interacci√≥n del usuario.
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

    // --> MÈtodos
    public String mainMenu(IMap map){
        System.out.println("####################################################################################");
        System.out.println("+++++ Tipo de Map : [" + map + "] +++++");
        System.out.println("Men˙ principal: ");
        System.out.println("1. Definir tipo de Map."); // Seleccion de Map
        System.out.println("2. Agregar un producto a la colecciÛn del usuario.");  //Producto agregado a la lista de compras
        System.out.println("3. Mostrar la categorÌa de un producto."); // La categoria del producto es "Lacteos" // Ya esta
        System.out.println("4. Mostrar carrito de compra (Ordenado por categorÌa)."); //Un for, pero ordenado por categoria
        System.out.println("5. Ver productos disponibles en la tienda (Ordenadas por categoria)."); // El listado de todo dentro del archivo pero ordenado // Ya esta
        System.out.println("6. Salir");

        String op = scan.nextLine();
        return op;
    }
    
    public String getCategory() {
		System.out.print("Escriba que categoria quiere buscar: ");
        String busqueda = scan.nextLine();
		return busqueda;
    }

    public String defineMap(){
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");

        String op = scan.nextLine();         
        return op;
    }

    public void errorFile(){
        System.out.println("--> No se logro encontrar el archivo");
    }

    public void errorMap(){
        System.out.println("--> HEY! TodavÌa no has definido un map, tienes que definir uno");
    }

    public void errorUknow(){
        System.out.println("--> Error desconocido :(");
    }
    
    public void invalid(){
        System.out.println("--> OpciÛn Inv·lida");
    }

    public void farewell(){
        System.out.println("--> Salinedo...");
    }

    public void dialogueTest(String information){
        System.out.println(information);
    }
}
