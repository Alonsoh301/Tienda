/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private IPainService paisService;
    @GetMapping("/persona")
    public String index (Model model){
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
    }
}
