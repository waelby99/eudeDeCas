package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.etudedecas.services.IReservationService;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Reservation;
import java.util.List;
@RestController
@AllArgsConstructor
public class ReservationRestController {

    private IReservationService iReservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation r){
        return iReservationService.addReservation(r);
    }

    @PutMapping("/modifierReservation")
    public Reservation updateReservation(@RequestBody Reservation r){
        return iReservationService.updateReservation(r);
    }

    @GetMapping("/getAllRes")
    public List<Reservation> getAllReservation(){
        return iReservationService.getAllReservations();
    }

    @GetMapping("/getReservation/{idR}")
    public Reservation findById(@PathVariable String idR){
        return iReservationService.getReservationById(idR);
    }

    @DeleteMapping("/supprimerReservation/{idR}")
    public void deleteReservation(@PathVariable String idR){
        iReservationService.deleteReservation(idR);
    }

    @GetMapping("/getResByIdEtud/{studentId}")
    public List<Reservation> getResByIdEtud(@PathVariable long studentId){
        return iReservationService.findReservationsByStudentId(studentId);
    }

    @GetMapping("/getResByNomEtud/{nom}")
    public List<Reservation> getResByNomEtud(@PathVariable String nom){
        return iReservationService.findReservationsByStudentName(nom);
    }
    @GetMapping("/getResByNomEtudAB")
    public List<Reservation> getResByNomEtudAB(){
        return iReservationService.findReservationsByStudentNameStartingWithAB();
    }
}