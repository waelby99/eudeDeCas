package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre c);
    public Chambre updateChambre(Chambre c);
    public List<Chambre> getAllChambre();
    public Chambre getChambreById(long idC);
    public void deleteChambre(long idC);
}
