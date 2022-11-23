package com.tienda.tienda.service;

import com.tienda.tienda.entity.Categorias;
import java.util.List;

/**
 *
 * @author Alonso
 */
public interface iCategoriasService {
    public List<Categorias> getALLcat();
    public Categorias getcatBylId(long id);
    public void savecat(Categorias Categorias);
    public void delete(long id);
}
