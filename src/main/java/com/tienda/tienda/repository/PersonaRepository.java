package com.tienda.tienda.repository;
import com.example.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Alonso
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}
