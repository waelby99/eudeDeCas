package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Eudiant;
import tn.esprit.etudedecas.services.IEtudiantService;

import java.util.Date;
import java.util.List;
@RestController
@AllArgsConstructor
public class EtudiantRestController {

    private IEtudiantService iEtudiantService;

    @PostMapping("/addEtudiant")
    public Eudiant addEtudiant(@RequestBody Eudiant e){
        return iEtudiantService.addEudiant(e);
    }
    @PutMapping("/modifierEtudiant")
    public Eudiant updateEtudiant(@RequestBody Eudiant e){
        return iEtudiantService.updateEudiant(e);
    }
    @GetMapping("/getAllEtud")
    public List<Eudiant> getAllEtudiant(){
        return iEtudiantService.getAllEudiant();
    }
    @GetMapping("/getEtudiant/{idE}")
    public Eudiant findById(@PathVariable long idE){
        return iEtudiantService.getEudiantById(idE);
    }
    @DeleteMapping("/supprimerEtudiant/{idE}")
    public void deleteEtudiant(@PathVariable long idE){
        iEtudiantService.deleteEudiant(idE);
    }

    @GetMapping("/getByDate/{dateDebut}/{dateFin}")
    public List<Eudiant> getEtudiantByDateNaissance(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDebut , @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateFin){
        return iEtudiantService.findByDateNaissanceBetween(dateDebut,dateFin);
    }

}
