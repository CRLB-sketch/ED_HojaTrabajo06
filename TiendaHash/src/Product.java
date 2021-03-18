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
	private String categoria;
	private String descripcion;
	private Integer stock;
	
	public Product(String categoria, String descripcion, Integer stock) {
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.stock = stock;
	}
	
	/**
	 * @return the nombre
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * @param nombre the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param existencia the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public String toString() {
		return "Categoria: " + categoria + " Descripcion: " + descripcion + " Stock: " + stock;
	}
}
