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
import mx.com.session26.model.entity.StudentInfo;
import mx.com.session26.model.service.IStudenInfoService;

@Controller
@SessionAttributes("studentInfo")
public class StudentInfoController {
    //@Autowired crea una instancia de servicio para poder utilizarla, inicializarla desde un contructor
    @Autowired
    private IStudenInfoService service;


    @GetMapping({"/studentInfo", "/studentInfo/", "/studentInfo/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Información de Estudiantes");
        model.addAttribute("studentInfo", service.list());
        return "studentInfo-list";
    }

    @GetMapping("/studentInfo/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Información de Estudiantes");
        model.addAttribute("studentInfo", new StudentInfo());
        return "studentInfo-form";
    }

    @PostMapping("/studentInfo/form")
    public String save(@Valid StudentInfo studentInfo, BindingResult br, Model model){
        if (br.hasErrors()) {
            model.addAttribute("title", "Formulario de Información deEstudiantes");
            return "studentInfo-form";
        }
        service.save(studentInfo);
        return "redirect:/studentInfo/list";
    }

    @GetMapping("/studentInfo/form/{id}")
    public String update(@PathVariable Long id, Model model){
        StudentInfo studentInfo = null;
        if (id>0) {
            studentInfo = service.getById(id);
        }else{
            return "redirect:/studentInfo/list";
        }
        model.addAttribute("title", "Editar Información de Estudiante");
        model.addAttribute("studentInfo", studentInfo);
        return "studentInfo-form";
    }

    @GetMapping("/studentInfo/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id > 0) {
            service.delete(id);
        }
        return "redirect:/studentInfo/list";
    }
}
