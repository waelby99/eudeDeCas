package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer addFoyer(Foyer f);
    public Foyer updateFoyer(Foyer f);
    public List<Foyer> getAllFoyer();
    public Foyer getFoyerById(long idF);
    public void deleteFoyer(long idF);
}
