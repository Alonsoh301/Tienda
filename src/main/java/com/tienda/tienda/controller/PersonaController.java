package com.tienda.tienda.controller;

import com.tienda.tienda.entity.Pais;
import com.tienda.tienda.entity.Persona;
import com.tienda.tienda.service.IPaisService;
import com.tienda.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Alonso
 */
@Controller
public class PersonaController {
    @Autowired
    private IPersonaService PersonaService;
    @Autowired
    private IPaisService PaisService;
    @GetMapping("/persona")
    public String index (Model model){
        List<Persona> listaPersona = PersonaService.getALLPersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
        return "personas";
    }
    @GetMapping("/personaN")
    public String crearPersona(Model model){
        List<Pais> listaPaises = PaisService.listCountry();
        model.addAttribute("Persona",new Persona());
        model.addAttribute("paises",listaPaises);
        return "crear";
    }
}