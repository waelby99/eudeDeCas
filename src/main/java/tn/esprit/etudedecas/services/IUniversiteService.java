package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public Universite addUniversite(Universite u);
    public Universite updateUniversite(Universite u);
    public List<Universite> getAllUniversites();
    public Universite getUniversiteById(long idU);
    public void deleteUniversite(long idU);
}
