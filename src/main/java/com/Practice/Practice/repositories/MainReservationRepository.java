package com.Practice.Practice.repositories;

import com.Practice.Practice.entities.MainReservation;
import com.Practice.Practice.entities.ReservationFromContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainReservationRepository extends JpaRepository<MainReservation, Long> {



}
