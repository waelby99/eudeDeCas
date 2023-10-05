package tn.esprit.etudedecas.entities;

import java.util.Date;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="Universite")
public class Universite implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private long idUniversite;
    @Column(name="nomUniversite")
    private String nomUniversite;
    @Column(name="adresse")
    private String adresse;
}
