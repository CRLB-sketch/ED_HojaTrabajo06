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

public class Controller {
    
    // --> Atributos
    private View view;

    // --> Métodos
    public Controller(){
        view = new View();
    }

    // --> Constructor
    public void menu(){

        boolean out = false;

        do {
            
            String op = view.mainMenu();

            switch (op) {

                // 1. 
                case "1":
                    view.dialogueTest("----- Agregar Producto -----");
                    break;
                    
                // 2. 
                case "2":
                    view.dialogueTest("----- Mostrar categoria Producto -----");                    
                    break;

                // 3. 
                case "3":
                    view.dialogueTest("----- Mostrar datos producto -----");
                    break;

                // 4. 
                case "4":
                    view.dialogueTest("----- Mostrar datos producto (Ordenadamente) -----");
                    break;

                // 5. 
                case "5":
                    view.dialogueTest("----- Mostrar categoria Producto y Categoria -----");
                    break;

                // 6. 
                case "6":
                    view.dialogueTest("----- Mostrar Producto y Categoria Existentes (Ordenadamente) -----");
                    break;

                // 7. 
                case "7":
                    out = true;
                    view.farewell();
                    break;
            
                default:
                    view.invalid();
                    break;
            }
            
        } while (!out);
        
    }
}
