/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> Our Tree Map (Clase tipo "Controlador")</h2>
 * 
 * Operaciones con mapas
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

import java.util.Map;
import java.util.TreeMap;

public class OurTreeMap implements IMap{
    
    // --> Definir el Tree Map
    private TreeMap<String, String> map;

    // --> Constructor
    public OurTreeMap(){
        map = new TreeMap<>();
    }
    
    // --> Métodos
    @Override
    public void putElement(String key, String value){
        map.put(key, value);
    }

    @Override
    public String seeContent(){
        String information = "";

        for(Map.Entry<String, String> entry: map.entrySet()){
            information += "Categoria: " + entry.getKey() + " - Descripción Producto: " + entry.getValue();
        }
        
        return information;
    }

    @Override
    public String toString() {
        return "Tree Map";
    }

}
