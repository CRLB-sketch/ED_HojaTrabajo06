/**
 * <h1> Hoja de Trabajo 04 </h1>
 * <h2> ReaderTxt </h2>
 * 
 * Operaciones con mapas
 * 
 * Esta clase se encargará de leer los archivos txt para obtener su información
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * 
 * @author [Cristian Laynez, Oscar Estrada]
 * @version 1.0
 * @since 2021-Marzo-11
 **/    

import java.io.*;

public class ReaderTxt {

    /** 
     * Método para leer el archivo ingresado
     * 
     * @param file      Para solicitar la dirección del archivo.
     * @return String   Para retornar el texto del archivo
     *                  o la información.
     */
    public static String readFile(String file){
        BufferedReader bf;
        String text = "";
        
        try {

            bf = new BufferedReader(new FileReader(file));
            String temp = "";
            String bfRead;

            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead + "\n";
            }

            text = temp;

        } catch (Exception e) {
            text = "error";
        }

        return text;
    }

    public static IMap bringMap(String info, IMap map){

        String[] words = info.split("[|]");

        for (int i = 0; i < words.length-1; i++) {
            String key = words[i].toLowerCase();
            int module = i % 2;

            if(module == 0){ // Numero Par
                String value = words[i+1].toLowerCase();
                map.putElement(key, value);                
            }            
        }    
        
        return map;
    }

}
