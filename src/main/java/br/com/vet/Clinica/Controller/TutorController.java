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

import br.com.vet.Clinica.Entity.Tutor;
import br.com.vet.Clinica.Service.TutorService;

@Controller
@RequestMapping("/Tutores")
public class TutorController {
    
    @Autowired
    private TutorService tutorService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Tutor tutor) {
        tutorService.save(tutor);
        return "redirect:/tutores/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Tutor> tutores = tutorService.findAll();
        model.addAttribute("tutores", tutores);
        return "Tutor/listaTutor";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("tutor", new Tutor());
        return "Tutor/cadastroTutor";
    }

    @GetMapping("/excluir/{idTutor}")
    public String excluir(@PathVariable("idTutor") Integer idTutor) {
        tutorService.deleteById(idTutor);
        return "redirect:/tutores/listar";
    }

    @GetMapping("/editar/{idTutor}")
    public String editarForm(@PathVariable("idTutor") Integer idTutor, Model model) {
        Tutor tutor = tutorService.findById(idTutor);
        model.addAttribute("tutor", tutor);
        return "Tutor/cadastroTutor";
    }

    @PostMapping("/atualizar/{idTutor}")
    public String atualizar(@PathVariable("idTutor") Integer idTutor, @ModelAttribute Tutor tutor) {
        tutorService.update(idTutor, tutor);
        return "redirect:/tutores/listar";
    }
}
