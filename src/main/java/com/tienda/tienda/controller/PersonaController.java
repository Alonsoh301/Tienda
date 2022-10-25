package com.tienda.tienda.controller;
/**
 *
 * @author Alonso
 */
@Controller
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    @Autowired
    private IPaisService paisService;
    @GetMapping("/persona")
    public String index (Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
    }
}
