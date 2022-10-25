package com.tienda.tienda.service;
import com.tienda.tienda.repository.PersonaRepository;
import org.springframework.stereotype.Service;
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personalRepository;
    @Override
    public List<Persona> getALLPersona(){
        return (List<Persona>)personaRepository.findALL();
    }
    @Override
    public Persona getPersonaById(long id ){
        return personalRepository.findById(id).orElse(null);
    }    
    @Override
    public void savePersona(Persona persona){
        personalRepository.save(persona);
    }
    @Override
    public void delete(long id){
        personalRepository.deleteById(id)
    }
}
