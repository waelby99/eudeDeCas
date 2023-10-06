package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.*;
@Entity
@Table(name="Eudiant")
public class Eudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long idEtudiant;
    @Column(name="nomEt")
    private String nomEt;
    @Column(name="prenomEt")
    private String prenomEt;
    @Column(name="cin")
    private long cin;
    @Column(name="ecole")
    private String ecole;
    @Column(name="dateNaissance")
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany(mappedBy = "eudiants")
    private Set<Reservation> reservations;
}
