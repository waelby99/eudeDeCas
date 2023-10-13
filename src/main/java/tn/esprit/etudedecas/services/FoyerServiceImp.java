package tn.esprit.etudedecas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.repositories.FoyerRepository;

import java.util.List;

@Service
public class FoyerServiceImp implements IFoyerService{

    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyer(long idF) {
        foyerRepository.deleteById(idF);
    }
}
