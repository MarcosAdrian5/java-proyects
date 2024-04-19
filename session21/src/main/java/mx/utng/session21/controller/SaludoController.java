package mx.utng.session21.controller;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saludar(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo de SpringBoot");
    }
}
