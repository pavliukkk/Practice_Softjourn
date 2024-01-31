package com.Practice.Practice.controllers;

import com.Practice.Practice.entities.ReservationFromContact;
import com.Practice.Practice.repositories.ReservationRepository;
import com.Practice.Practice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationService;

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("/contact")
    public String contactReservation(@RequestParam String name, @RequestParam String surname, @RequestParam String email,
                                     @RequestParam String phone, @RequestParam Date date, @RequestParam String time, @RequestParam String people) {

        ReservationFromContact reservationContact = new ReservationFromContact(name, surname, email, phone, date, time, people);
        reservationService.save(reservationContact);
        return "redirect:/menu";
    }

}
