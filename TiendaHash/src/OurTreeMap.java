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
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.TreeMap;

public class OurTreeMap implements IMap{
    
    // --> Definir el Tree Map
    private TreeMap<Integer, Product> productsStore;

    // --> Constructor
    public OurTreeMap(){
        productsStore = new TreeMap<Integer, Product>();
    }
    
    // --> Métodos    
    
    /** 
     * Método para leer el documento
     * 
     * @return String   Retornará un mensaje
     */
    @Override
    public String readList() {

        String info = "";

        try {
            FileReader fr = new FileReader("docs\\ListadoProducto.txt");
			BufferedReader entrada = new BufferedReader(fr); 
			String s;
			Integer key = 0;
			
			while((s = entrada.readLine()) != null) {
				String[] temp = s.split("\\|");
				productsStore.put(key, new Product(temp[0].trim(),temp[1].trim(),Integer.parseInt(temp[2].trim())));
				key += 1;
			}
        } 
        catch(java.io.FileNotFoundException fnfex) {
            info = "Archivo no encontrado: " + fnfex;
        }
		catch(java.io.IOException ioex) {}
        
        return info;
    }
        
    /** 
     * Método para enseñar los productos con sus categorias
     * 
     * @return String   Retornará el contenido
     */
    @Override
    public String showMapping() {
        String chain = "";

        for(Map.Entry<Integer, Product> product: productsStore.entrySet()){
            Integer key = product.getKey();
            Product ProductIndividual = product.getValue();
            chain += key + ".)"  + ProductIndividual.getCategoria() + " | " + ProductIndividual.getDescripcion() + " | " + ProductIndividual.getStock() + "\n";
        }

        return chain;
    }
        
    /** 
     * Método para buscar productos por categoría
     * 
     * @param search    Elemento/Producto deseado
     * @return String   Retornará los elementos o un mensaje
     */
    @Override
    public String searchByCategory(String search) {
        String chain = "";

        ArrayList<String> finded = new ArrayList<String>();
		for(Map.Entry<Integer, Product> product: productsStore.entrySet()) {	
			Product productoIndividual = product.getValue();
			if(productoIndividual.getCategoria().equals(search)) {
                String the_String = productoIndividual.getCategoria() + " | " + productoIndividual.getDescripcion() + " | " + productoIndividual.getStock();
                finded.add(the_String);
			}
		}

        if(finded.size() == 0){
            chain = "--> Error, esa categoria no existe";
        }
        else{
            for(String str: finded){
                chain += str + "\n";
            }
        }

        return chain;
    }
            
    /** 
     * Método para obtener un producto en específico.
     * Se estará restando al stock cuando este avance.
     * 
     * @param search    Elemento/Producto deseado
     * @return String   Retornará el producto o mensaje
     */
    @Override
    public String obtainProduct(String search) {
        String info = "";

        for(Map.Entry<Integer, Product> product: productsStore.entrySet()){
            Product individualProduct = product.getValue();

            if(individualProduct.getDescripcion().equals(search) && individualProduct.getStock() >= 1){                                
                individualProduct.setStock(individualProduct.getStock() - 1);    
                String producto = individualProduct.getCategoria() + " | " + individualProduct.getDescripcion();
                info = producto;
                break;                
            }
            else{
                info = "NotAvalaible";
            }
        }
        
        return info;
    }
    
    /** 
     * Método toString
     * 
     * @return String   String deseado
     */
    @Override
    public String toString() {
        return "Tree Map";
    }
}
