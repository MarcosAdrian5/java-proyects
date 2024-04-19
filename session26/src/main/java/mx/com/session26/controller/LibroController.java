package mx.com.session26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.com.session26.model.entity.Libro;
import mx.com.session26.model.service.ILibroService;

@Controller
@SessionAttributes("libro")
public class LibroController {
    //@Autowired crea una instancia de servicio para poder utilizarla, inicializarla desde un contructor
    @Autowired
    private ILibroService service;


    @GetMapping({"/libro", "/libro/", "/libro/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Libros");
        model.addAttribute("libros", service.list());
        return "libro-list";
    }

    @GetMapping("/libro/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Libros");
        model.addAttribute("libro", new Libro());
        return "libro-form";
    }

    @PostMapping("/libro/form")
    public String save(@Valid Libro libro, BindingResult br, Model model){
        if (br.hasErrors()) {
            model.addAttribute("title", "Formulario de Libros");
            return "libro-form";
        }
        service.save(libro);
        return "redirect:/libro/list";
    }

    @GetMapping("/libro/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Libro libro = null;
        if (id>0) {
            libro = service.getById(id);
        }else{
            return "redirect:/libro/list";
        }
        model.addAttribute("title", "Editar Libro");
        model.addAttribute("libro", libro);
        return "libro-form";
    }

    @GetMapping("/libro/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id > 0) {
            service.delete(id);
        }
        return "redirect:/libro/list";
    }
}
