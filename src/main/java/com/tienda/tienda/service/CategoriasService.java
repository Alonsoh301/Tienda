package com.tienda.tienda.service;

import com.tienda.tienda.entity.Categorias;
import com.tienda.tienda.repository.CategoriasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alonso
 */
@Service
public class CategoriasService {
    @Autowired
    private CategoriasRepository CategoriasRepository;
    
    @Override
    public List<Categorias> getALLcat(){
        return (List<Categorias>) CategoriasRepository.findAll();
    }
    @Override
    public void savecat(Categorias Categorias){
        CategoriasRepository.save(Categorias);
    }
    @Override
    public void delete(long id){
        CategoriasRepository.deleteById(id);
    }

    @Override
    public Categorias getcatBylId(long id) {
        return CategoriasRepository.findById(id).orElse(null);
    }
}
