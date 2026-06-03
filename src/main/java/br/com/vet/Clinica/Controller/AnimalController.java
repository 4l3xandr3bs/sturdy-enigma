package br.com.vet.Clinica.Controller;
import java.util.list;
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
@Controller
@RequestMapping("/Animais")
public class AnimalController {
    @Autowired
    public AnimalService animalService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute  @Autowired);
    public AnimalService animalService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Animal cliente) {
        // salva aluno
        animalService.save(cliente);

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
        return "Animal/cadastroAnimal";
    }

    @GetMapping("/excluir/{idCliente}")
    public String excluir(@PathVariable("idAnimal") Integer idAnimal) {
        animalService.deleteById(idAnimal);
        return "redirect:/animais/listar";
    }

    @GetMapping("/editar/{idCliente}")
    public String editarForm(@PathVariable("idAnimal") Integer idAnimal, Model model) {
        Animal animal = animalService.findById(idAnimal);
        model.addAttribute("animal", animal);
        return "Animal/cadastroAnimal";
    }
   {
    
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
        return "Animal/cadastroAnimal";
    }


}
