package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.AddressLocation;
import com.example.booking.domain.valueobjects.Car;
import com.example.booking.domain.valueobjects.RoomType;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class CarRental  extends AbstractEntity<BookingId> {

    private Car car;
    private LocalDate rentalPeriod;
    private AddressLocation pickUpLocation;

}