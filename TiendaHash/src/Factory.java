/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> Factory </h2>
 * 
 * Operaciones con mapas
 * 
 * Patron de diseño factory para poder solicitar:
 * HashMap, TreeMap
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

public class Factory {
    
    
    /** 
     * Método con patrón de diseño Factory
     * 
     * @param type      Seleccionar tipo de Map
     * @return IMap     Retornará un map específico
     */
    public static IMap create(String type){
        switch (type) {

            // Implementar [Hash Map]
            case "1":
                return new OurHashMap();

            // Implementar [Tree Map]
            case "2":
                return new OurTreeMap();
        
            // Map Inválido
            default:
                return null;
                
        }
    }
    
}
