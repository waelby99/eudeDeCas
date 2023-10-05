package tn.esprit.etudedecas.entities;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Chambre")
public class Chambre implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private long idChambre;
    @Column(name="numeroChambre")
    private long numeroChambre;
    @Column(name="typeC")
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
