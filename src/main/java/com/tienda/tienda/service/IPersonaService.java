package com.tienda.tienda.service;

import com.example.tienda.entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getALLPersona();
    public Persona getPersonaBylId(long id);
    public void savePersona(Persona persona);
    public void delete(long id);
}
