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

public class Controller {
    
    // --> Atributos
    private View view;
    private IMap map;

    // --> Métodos
    public Controller(){
        view = new View();
    }

    // --> Constructor
    public void menu(){

        boolean out = false;

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
    
                            String all = ReaderTxt.readFile("docs\\ListadoProducto.txt");
    
                            if(all.equals("error")){
                                view.errorFile();
                            }
                            else{
                                map = ReaderTxt.bringMap(all, map);                                                      
                            }
    
                        }
                        
                        break;
                        
                    // 2. Agregar Producto
                    case "2":
                        view.dialogueTest("----- Agregar Producto -----");
                        break;
                        
                    // 3. Mostrar Categoria Producto
                    case "3":
                        view.dialogueTest("----- Mostrar categoria Producto -----");                    
                        break;
                        
                    // 4. Mostrar datos producto
                    case "4":
                        view.dialogueTest("----- Mostrar datos producto -----");
                        break;
                        
                    // 5. Mostrar datos producto (Ordenadamente)
                    case "5":
                        view.dialogueTest("----- Mostrar datos producto (Ordenadamente) -----");
                        break;
                        
                    // 6. Mostrar categoria Producto y Categoria de todo el inventario
                    case "6":
                        view.dialogueTest("----- Mostrar Producto y Categoria -----");                                        
                        view.dialogueTest(map.seeContent());
    
                        break;
                        
                    // 7. Mostrar Producto y Categoria Existente
                    case "7":
                        view.dialogueTest("----- Mostrar Producto y Categoria Existentes (Ordenadamente) -----");
                        break;
    
                    // 8. Salir
                    case "8":
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

}
