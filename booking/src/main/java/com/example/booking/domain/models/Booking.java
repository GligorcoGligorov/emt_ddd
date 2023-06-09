package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.Destination;
import com.example.booking.domain.valueobjects.ModeOfTransport;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
public class Booking extends AbstractEntity<BookingId> {

    private Date bookingDate;

    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "BookingPrice_amount")),
            @AttributeOverride(name = "currency", column = @Column(name = "BookingPrice_currency"))
    })

    private Money bookingPrice;

    @OneToOne(cascade = CascadeType.ALL)
    private Hotel hotel;

    @OneToOne(cascade = CascadeType.ALL)
    private Flight flight;

    @OneToOne(cascade = CascadeType.ALL)
    private CarRental carRental;

    @JsonIgnore
    @ManyToMany(mappedBy = "bookingList")
    private List<Itinerary> itineraries;


    public Booking() {
    }

    public Booking(Date bookingDate, Money bookingPrice, Hotel hotel, Flight flight, CarRental carRental) {
        this.bookingDate = bookingDate;
        this.bookingPrice = bookingPrice;
        this.hotel = hotel;
        this.flight = flight;
        this.carRental = carRental;
    }
}
