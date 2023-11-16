package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> getAllBlocs();
    public Bloc getBlocById(long idB);
    public void deleteBloc(long idB);

  public Bloc findBlocByChambreId(long idC);

}
