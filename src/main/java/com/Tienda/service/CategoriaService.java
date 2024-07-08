
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se obtiene el listado de Categorias en un List
    public List<Categoria> getCategorias(boolean activos);
}
