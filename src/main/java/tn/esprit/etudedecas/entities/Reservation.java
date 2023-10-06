package tn.esprit.etudedecas.entities;

import java.util.Date;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable{
    @Id
    @Column(name="idReservation")
    private String idReservation;

    @Temporal (TemporalType.DATE)
    @Column(name="anneeUniversitaire")
    private Date anneeUniversitaire;
    @Column(name="estValide")
    private boolean estValide;
    @ManyToMany
    private Set<Eudiant> eudiants;
}
