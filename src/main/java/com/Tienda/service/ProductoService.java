
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //Se obtiene el listado de Categorias en un List- READ
    public List<Producto> getProductos(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un producto - READ parametro (producto)
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío- CREATE
    // Se actualiza un producto si el id del producto NO esta vacío - UPDATE
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro -  DELETE
    public void delete(Producto producto);
    
    // Lista de productos con precio entre ordenados por descripcion ConsultaAmpliada
  public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf,double precioSup);
 //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    
 //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
