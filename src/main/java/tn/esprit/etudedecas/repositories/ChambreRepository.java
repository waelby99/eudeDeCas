package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
