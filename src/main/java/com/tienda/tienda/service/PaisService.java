package com.tienda.tienda.service;
import com.tienda.tienda.entity.Pais;
import com.example.Tienda2.repository.PaisRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class PaisService implements IPaisService {
    @Autowired
        private PaisRepository PaisRepository;
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findALL();
    }
}