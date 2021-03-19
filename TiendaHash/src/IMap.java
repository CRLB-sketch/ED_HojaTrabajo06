/**
 * <h1> Hoja de Trabajo 06 </h1>
 * <h2> IMap (clase tipo "interface") </h2>
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

public interface IMap {
    
    public String readList();

    public String showMapping();

    public String searchByCategory(String search);

    public String obtainProduct(String search);
    
    public String toString();
    
}
