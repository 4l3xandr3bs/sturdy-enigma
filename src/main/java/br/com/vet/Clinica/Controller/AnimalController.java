package br.com.vet.Clinica.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vet.Clinica.Entity.Animal;
import br.com.vet.Clinica.Service.AnimalService;
import br.com.vet.Clinica.Service.TutorService;

@Controller
@RequestMapping("/Animais")
public class AnimalController {
    
    @Autowired
    private AnimalService animalService;
    
    @Autowired
    private TutorService tutorService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Animal animal) {
        animalService.save(animal);
        return "redirect:/animais/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Animal> animais = animalService.findAll();
        model.addAttribute("animais", animais);
        return "Animal/listaAnimal";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("animal", new Animal());
        model.addAttribute("tutores", tutorService.findAll());
        return "Animal/cadastroAnimal";
    }

    @GetMapping("/excluir/{idAnimal}")
    public String excluir(@PathVariable("idAnimal") Integer idAnimal) {
        animalService.deleteById(idAnimal);
        return "redirect:/animais/listar";
    }

    @GetMapping("/editar/{idAnimal}")
    public String editarForm(@PathVariable("idAnimal") Integer idAnimal, Model model) {
        Animal animal = animalService.findById(idAnimal);
        model.addAttribute("animal", animal);
        model.addAttribute("tutores", tutorService.findAll());
        return "Animal/cadastroAnimal";
    }

    @PostMapping("/atualizar/{idAnimal}")
    public String atualizar(@PathVariable("idAnimal") Integer idAnimal, @ModelAttribute Animal animal) {
        animalService.update(idAnimal, animal);
        return "redirect:/animais/listar";
    }
}
