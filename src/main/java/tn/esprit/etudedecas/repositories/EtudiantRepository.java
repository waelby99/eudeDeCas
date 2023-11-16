package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Eudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Eudiant,Long> {
    public List<Eudiant> findByNomEt(String nom);

    public List<Eudiant> findByDateNaissanceBetween(Date dateDebut, Date dateFin);
}
