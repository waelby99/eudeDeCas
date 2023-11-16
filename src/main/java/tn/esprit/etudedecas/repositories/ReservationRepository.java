package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {

    @Query("SELECT r FROM Reservation r JOIN r.eudiants e WHERE e.idEtudiant = :studentId")
    public List<Reservation> findReservationsByStudentId(@Param("studentId") long studentId);

    @Query("SELECT r FROM Reservation r JOIN r.eudiants e WHERE e.nomEt = :nom")
    public List<Reservation> findReservationsByStudentName(@Param("nom") String nom);

    @Query("SELECT r FROM Reservation r JOIN r.eudiants e WHERE e.nomEt LIKE 'AB%'")
    List<Reservation> findReservationsByStudentNameStartingWithAB();
}
