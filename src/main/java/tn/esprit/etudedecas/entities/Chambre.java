package tn.esprit.etudedecas.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

import lombok.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
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
    @OneToMany
    private Set<Reservation> reservations;

    @ManyToOne
    @JsonIgnore
    private Bloc bloc;
}
