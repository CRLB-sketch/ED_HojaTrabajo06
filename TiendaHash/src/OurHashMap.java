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
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.HashMap;

public class OurHashMap implements IMap{
	
    // --> Definir el Hash Map
    private HashMap <Integer, Product> ProductsTienda; 
	
    // --> Constructor
	public OurHashMap() {
		ProductsTienda = new HashMap <Integer, Product>();
	}
   
    // --> Métodos    
    
    /** 
     * @return String
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
				ProductsTienda.put(key, new Product(temp[0].trim(),temp[1].trim(),Integer.parseInt(temp[2].trim())));
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
     * @return String
     */
    @Override
	public String showMapping() {
		String cadena = "";
		
		for(Map.Entry<Integer, Product> product: ProductsTienda.entrySet()) {
			Integer llave = product.getKey();
			Product ProductIndividual = product.getValue();
			cadena = cadena + llave + ".) " + ProductIndividual.getCategoria() + " | " + ProductIndividual.getDescripcion() + " | " + ProductIndividual.getStock() + "\n";
		}

		return cadena;
	}
	
    
    /** 
     * @param search
     * @return String
     */
    @Override
	public String searchByCategory(String search) {

		String cadena = "";

		ArrayList<String> finded = new ArrayList<String>();
		for(Map.Entry<Integer, Product> product: ProductsTienda.entrySet()) {	
			Product productoIndividual = product.getValue();
			if(productoIndividual.getCategoria().equals(search)) {
                String the_String = productoIndividual.getCategoria() + " | " + productoIndividual.getDescripcion() + " | " + productoIndividual.getStock();
                finded.add(the_String);
			}
		}

        if(finded.size() == 0){
            cadena = "--> Error, esa categoria no existe";
        }
        else{
            for(String str: finded){
                cadena += str + "\n";
            }
        }

		return cadena;        
	}
	    
    
    /** 
     * @param search
     * @return String
     */
    @Override
    public String obtainProduct(String search) {

        String info = "";

        for(Map.Entry<Integer, Product> product: ProductsTienda.entrySet()){
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
     * @return String
     */
    @Override
    public String toString() {
        return "Hash Map";
    }

}
