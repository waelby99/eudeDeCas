package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Eudiant;
import tn.esprit.etudedecas.repositories.EtudiantRepository;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{


    private EtudiantRepository etudiantRepository;
    @Override
    public Eudiant addEudiant(Eudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Eudiant updateEudiant(Eudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Eudiant> getAllEudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Eudiant getEudiantById(long idE) {
        return etudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEudiant(long idE) {
        etudiantRepository.deleteById(idE);
    }

    @Override
    public List<Eudiant> getByNom(String nom) {
        return etudiantRepository.findByNomEt(nom);
    }
    @Override
    public List<Eudiant> findByDateNaissanceBetween(Date dateDebut, Date dateFin) {
        return etudiantRepository.findByDateNaissanceBetween(dateDebut,dateFin);
    }
}
