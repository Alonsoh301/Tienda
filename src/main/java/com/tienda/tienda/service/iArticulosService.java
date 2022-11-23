package com.tienda.tienda.service;

import com.tienda.tienda.entity.articulos;
import java.util.List;

/**
 *
 * @author Alonso
 */
public interface iArticulosService {
    public List<articulos> getALLarticulos();
    public articulos getarticulosBylId(long id);
    public void savearticulos(articulos Articulos);
    public void delete(long id);
}
