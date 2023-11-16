package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.Universite;
import tn.esprit.etudedecas.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    private IUniversiteService iUniversiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite u){
        return iUniversiteService.addUniversite(u);
    }

    @PutMapping("/modifierUniversite")
    public Universite updateUniversite(@RequestBody Universite u){
        return iUniversiteService.updateUniversite(u);
    }
    @GetMapping("/getAllUn")
    public List<Universite> getAllUniversite(){
        return iUniversiteService.getAllUniversites();
    }

    @GetMapping("/getUniversite/{idU}")
    public Universite findById(@PathVariable long idU){
        return iUniversiteService.getUniversiteById(idU);
    }
    @DeleteMapping("/supprimerUniversite/{idU}")
    public void deleteUniversite(@PathVariable long idU){
        iUniversiteService.deleteUniversite(idU);
    }

    @GetMapping("/getUnByFoyer/{nomFoyer}")
    public Universite getUniversiteByFoyer(@PathVariable String nomFoyer){
        return iUniversiteService.getUniversiteByFoyer(nomFoyer);
    }

}
