package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.etudedecas.services.IBlocService;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Bloc;
import java.util.List;
@RestController
@AllArgsConstructor
public class BlocRestController {

    private IBlocService iBlocService;

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return iBlocService.addBloc(b);
    }

    @PutMapping("/modifierBloc")
    public Bloc updateBloc(@RequestBody Bloc b){
        return iBlocService.updateBloc(b);
    }

    @GetMapping("/getAllB")
    public List<Bloc> getAllBloc(){
        return iBlocService.getAllBlocs();
    }

    @GetMapping("/getBloc/{idB}")
    public Bloc findById(@PathVariable long idB){
        return iBlocService.getBlocById(idB);
    }

    @DeleteMapping("/supprimerBloc/{idB}")
    public void deleteBloc(@PathVariable long idB){
        iBlocService.deleteBloc(idB);
    }
}