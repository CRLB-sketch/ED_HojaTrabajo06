/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> View (Clase tipo "Vista")</h2>
 * 
 * Operaciones con mapas
 * 
 * Para tener toda la interacciÃ³n del usuario.
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

    // --> Mï¿½todos
    
    /** 
     * Método para mostrar el menu principal
     * 
     * @param map       Tipo de map seleccionado
     * @return String   Retornará¡ la opción deseada
     */
    public String mainMenu(IMap map){
        System.out.println("####################################################################################");
        System.out.println("+++++ Tipo de Map : [" + map + "] +++++");
        System.out.println("Menú principal: ");
        System.out.println("1. Definir tipo de Map."); 
        System.out.println("2. Agregar un producto a la colección del usuario.");  
        System.out.println("3. Mostrar productos por categoría."); 
        System.out.println("4. Mostrar carrito de compra (Ordenado por categoría)."); 
        System.out.println("5. Ver productos disponibles en la tienda (Ordenadas por categoría).");
        System.out.println("6. Salir");

        String op = scan.nextLine();
        return op;
    }
    
    /** 
     * Método para escoger un producto
     * 
     * @return String   Retornará el producto deseado
     */
    public String choiceProduct(){
        System.out.println("Escriba el producto que desee agregar: ");

        String search = scan.nextLine();
        return search;
    }
        
    /** 
     * Método para obtener una categoría
     * 
     * @return String   Retornará el nombre de la categoría
     */
    public String getCategory() {
		System.out.print("Escriba que categoria quiere buscar: ");

        String search = scan.nextLine();
		return search;
    }
    
    /** 
     * Método para definir un map
     * 
     * @return String   Nombre del map
     */
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
        System.out.println("--> HEY! Todavía no has definido un map, tienes que definir uno");
    }

    public void errorUknow(){
        System.out.println("--> Error desconocido :(");
    }
    
    public void invalid(){
        System.out.println("--> Opción Inválida");
    }

    public void farewell(){
        System.out.println("--> Saliendo...");
    }

    
    /** 
     * MÃ©todo para mostrar información adicional e importante
     * 
     * @param information   Información ingresada
     */
    public void dialogueTest(String information){
        System.out.println(information);
    }
}
