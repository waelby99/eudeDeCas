package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private long idBloc;
    @Column(name="nomBloc")
    private String nomBloc;
    @Column(name="capaciteBloc")
    private long capaciteBloc;
}
