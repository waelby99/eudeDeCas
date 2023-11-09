package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Eudiant;

public interface EtudiantRepository extends JpaRepository<Eudiant,Long> {

}
