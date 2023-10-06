package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.*;

@Entity
@Table(name="Foyer")
public class Foyer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private long idFoyer;
    @Column(name="nomFoyer")
    private String nomFoyer;
    @Column(name="capaciteFoyer")
    private long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;


}
