package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Eudiant;

import java.util.List;

public interface IEtudiantService {
    public Eudiant addEudiant(Eudiant e);
    public Eudiant updateEudiant(Eudiant e);
    public List<Eudiant> getAllEudiant();
    public Eudiant getEudiantById(long idE);
    public void deleteEudiant(long idE);
}
