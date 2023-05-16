package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.AddressLocation;
import com.example.booking.domain.valueobjects.Car;
import com.example.booking.domain.valueobjects.FlightInfo;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Flight extends AbstractEntity<BookingId> {

    private FlightInfo airlineAndFlightNumber;
    private LocalDate timeOfDeparture;

}