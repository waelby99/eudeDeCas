package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Eudiant;
import tn.esprit.etudedecas.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    public Universite findByFoyerNomFoyer(String nomFoyer);
}
