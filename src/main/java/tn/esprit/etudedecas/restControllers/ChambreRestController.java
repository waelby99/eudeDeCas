package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.etudedecas.services.IChambreService;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Chambre;
import java.util.List;
@RestController
@AllArgsConstructor
public class ChambreRestController {

    private IChambreService iChambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }

    @PutMapping("/modifierChambre")
    public Chambre updateChambre(@RequestBody Chambre c){
        return iChambreService.updateChambre(c);
    }

    @GetMapping("/getAllCh")
    public List<Chambre> getAllChambre(){
        return iChambreService.getAllChambre();
    }

    @GetMapping("/getChambre/{idC}")
    public Chambre findById(@PathVariable long idC){
        return iChambreService.getChambreById(idC);
    }

    @DeleteMapping("/supprimerChambre/{idC}")
    public void deleteChambre(@PathVariable long idC){
        iChambreService.deleteChambre(idC);
    }

    @GetMapping("/getChambreBloc/{idB}")
    public List<Chambre> findByBloc(@PathVariable long idB){
        return iChambreService.findByBloc_IdBloc(idB);
    }
}
