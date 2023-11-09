package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.repositories.BlocRepository;
import tn.esprit.etudedecas.repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{

    private BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBloc(long idB) {
            blocRepository.deleteById(idB);
    }
}
