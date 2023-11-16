package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation r);
    public Reservation updateReservation(Reservation r);
    public List<Reservation> getAllReservations();
        public Reservation getReservationById(String idR);
    public void deleteReservation(String idR);
    public List<Reservation> findReservationsByStudentId(long studentId);
    public List<Reservation> findReservationsByStudentName(String nom);
    public List<Reservation> findReservationsByStudentNameStartingWithAB();
}
