package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.Eudiant;
import tn.esprit.etudedecas.repositories.ChambreRepository;
import tn.esprit.etudedecas.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImp implements IChambreService{

    private ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre c) {return chambreRepository.save(c);}

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreById(long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteChambre(long idC) { chambreRepository.deleteById(idC); }
}
