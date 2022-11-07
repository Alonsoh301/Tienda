package com.tienda.tienda.service;

import com.tienda.tienda.entity.articulos;
import com.tienda.tienda.repository.articulosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alonso
 */
@Service
public class ArticulosService implements iArticulosService{
    @Autowired
    private articulosRepository articulosRepository;
    
    @Override
    public List<articulos> getALLarticulos(){
        return (List<articulos>)articulosRepository.findAll();
    }
    @Override
    public void savearticulos(articulos articulos){
        articulosRepository.save(articulos);
    }
    @Override
    public void delete(long id){
        articulosRepository.deleteById(id);
    }

    @Override
    public articulos getarticulosBylId(long id) {
        return articulosRepository.findById(id).orElse(null);
    }

}
