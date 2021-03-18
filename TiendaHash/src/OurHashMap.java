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
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class OurHashMap implements IMap{
	
HashMap <Integer, Product> ProductsTienda; 
	
	public OurHashMap() {
		ProductsTienda = new HashMap <Integer, Product>();
		//leerListado();
	}
   
	public void leerListado() {
		// TODO Auto-generated method stub
		
		String texto = new String();
		try {
			FileReader fr = new FileReader("./doc/ListadoProduct.txt");
			BufferedReader entrada = new BufferedReader(fr); 
			String s;
			Integer key = 0;
			
			while((s = entrada.readLine()) != null) {
				String[] temp = s.split("\\|");
				ProductsTienda.put(key, new Product(temp[0].trim(),temp[1].trim(),Integer.parseInt(temp[2].trim())));
				key +=1;
			}
			
		}
		catch(java.io.FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado: " + fnfex);}
		catch(java.io.IOException ioex) {}
	}
	
	public String mostrarMapeo() {
		String cadena = "";
		
		for(Map.Entry<Integer, Product> product: ProductsTienda.entrySet()) {
			Integer llave = product.getKey();
			Product ProductIndividual = product.getValue();
			cadena = cadena + llave + ".) " + ProductIndividual.getCategoria() + " | " + ProductIndividual.getDescripcion() + " | " + ProductIndividual.getStock() + "\n";
		}
		return cadena;
	}
	
	public String buscarPorCategoria(String buscar) {
		String cadena = "";
		ArrayList<String> encontrados;
		for(Map.Entry<Integer, Product> product: ProductsTienda.entrySet()) {	
			Product ProductIndividual = product.getValue();
			if(ProductIndividual.getCategoria().equals(buscar)) {
				cadena = "La categoria del producto es: " + ProductIndividual.getCategoria();
			}else {
				cadena =  "Error, esa categoria no existe, ingresela de nuevo";
			}
		}
		return cadena;
	}
	
    @Override
    public String toString() {
        return "Hash Map";
    }

	@Override
	public void putElement(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String seeContent() {
		// TODO Auto-generated method stub
		return null;
	}
}
