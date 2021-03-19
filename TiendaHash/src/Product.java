/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> Product/Producto </h2>
 * 
 * Operaciones con mapas
 * 
 * Para representar uno de los productos
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

public class Product {

	// --> Atributos
	private String categoria;
	private String descripcion;
	private Integer stock;
	
	// --> Constructor
	public Product(String categoria, String descripcion, Integer stock) {
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.stock = stock;
	}
	
	/**
	 * Getter Categoria
	 * 
	 * @return the nombre
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Getter Descripción
	 * 
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Getter Stock
	 * 
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * Setter Stock
	 * 
	 * @param existencia the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	/** 
	 * Método To String
	 * 
	 * @return String	Retorna el nuevo String
	 */
	public String toString() {
		return "Categoria: " + categoria + " Descripcion: " + descripcion + " Stock: " + stock;
	}
}
