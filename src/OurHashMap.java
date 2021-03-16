/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> Our Hash Map </h2>
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
import java.util.HashMap;

public class OurHashMap implements IMap{

    private HashMap<String, String> map;
    
    public OurHashMap(){
        map  = new HashMap<String, String>();
    }
    
    @Override
    public void putElement(String key, String value) {
        map.put(key, value);
    }
    
    @Override
    public String seeContent(){
        String information = "";

        for(Map.Entry<String, String> entry: map.entrySet()){
            information += "\nCategoria: " + entry.getKey() + " - Descripción Producto: " + entry.getValue();
        }
        
        return information;
    }

    @Override
    public String toString() {
        return "Hash Map";
    }
    
}
