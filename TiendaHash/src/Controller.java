/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> Controller (Clase tipo "Controlador")</h2>
 * 
 * Operaciones con mapas
 * 
 * Para tener toda la lógica del programa.
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

import java.lang.NullPointerException;
import java.util.ArrayList;

public class Controller {
    
    // --> Atributos
    private View view;
    private IMap map;
    private ArrayList<String> user;

    // --> Métodos
    public Controller(){
        view = new View();
        user = new ArrayList<String>();
    }

    // --> Constructor
    /**
     * Método para tener el control del programa
     */
    public void menu(){

        // String info = "";                
        boolean out = false; // Para el menu

        do {
            
            String op = view.mainMenu(map);

            try {

                switch (op) {

                    // 1. Definir el tipo de Map
                    case "1":
                        view.dialogueTest("----- Definir Map -----");
                        // Establecer Mapa
                        String the_map = view.defineMap(); 
                        map = Factory.create(the_map);;           
                        
                        if(map == null){ // No esta definido
                            view.errorMap();
                        }
                        else{ // Se definio con exito   
                            view.dialogueTest(map.readList());
                            view.dialogueTest("--> Map listo");    
                        }
                        
                        break;
                        
                    // 2. Agregar Producto
                    case "2":
                        view.dialogueTest("----- Agregar Producto A Usuario-----");
                        String product = view.choiceProduct();
                        String finded = map.obtainProduct(product);

                        if(finded.equals("NotAvalaible")){
                            view.dialogueTest("--> Producto no disponible");
                        }
                        else{
                            String info = "--> Se agrego lo siguiente: " + product;
                            view.dialogueTest(info);
                            user.add(finded);
                        }

                        break;
                        
                    // 3. Mostrar Categoria Producto
                    case "3":
                        view.dialogueTest("----- Mostrar Categoria Producto -----");  
                        String category = view.getCategory();
                        
                        view.dialogueTest(map.searchByCategory(category));
                        break;
                        
                    // 4. Mostrar Los productos del carrito de compras
                    case "4":
                        view.dialogueTest("----- Mostrar carrito de compras -----");                                                

                        selectionSort(user);
                        
                        for(String str: user){
                            view.dialogueTest(str);
                        }

                        break;
                        
                    // 5. Mostrar productos de la tienda
                    case "5":
                        view.dialogueTest("----- Mostrar productos en tienda -----");
                        String showProducts = map.showMapping();
                        view.dialogueTest(showProducts);
                        break;
                        
                    // 8. Salir
                    case "6":
                        out = true;
                        view.farewell();
                        break;
                
                    // Opción inválida
                    default:
                        view.invalid();
                        break;
                }
            } 
            catch(NullPointerException ne){
                view.errorMap();
            }            
            catch (Exception e) {
                view.errorUknow();                           
            }            
            
        } while (!out);
        
    }

    
    /** 
     * Método Selection Sort para ordenar por categorias
     * 
     * @param user  ArrayList con Strings del carrito del usuario
     */
    private static void selectionSort(ArrayList<String> user){
        int min;
        String temp;

        for (int index = 0; index < user.size()-1; index++){
            min = index;
            for (int scan = index+1; scan < user.size(); scan++)
                if (user.get(scan).compareTo(user.get(min)) < 0)
                    min = scan;

            // Swap the values
            temp = user.get(min);
            user.set(min, user.get(index));
            user.set(index, temp);        
      }

    }
    
}
