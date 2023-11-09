package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements IReservationService{
    private ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(String idR) {
        return reservationRepository.findById(idR).orElse(null);
    }

    @Override
    public void deleteReservation(String idR) {
        reservationRepository.deleteById(idR);
    }
}
