package cl.praxis.DesafioSpring1.controller;

import cl.praxis.DesafioSpring1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EstudianteController {

    @GetMapping("/{name}/{last}/{age}")
    public String detallesEstudiante (@PathVariable("name") String name,
                                  @PathVariable("last") String last,
                                  @PathVariable("age") int age,
                                  Model model){

        Student student= new Student(name,last, age);
        System.out.println(student);
        model.addAttribute("student", student);
        return  "index";
    }

    @GetMapping("/saludos")
    public String saludo(){
        String saludar = "Hola, soy Luciano";
        System.out.println(saludar);
        return saludar;
    }
}
