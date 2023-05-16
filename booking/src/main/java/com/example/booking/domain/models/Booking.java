package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.Destination;
import com.example.booking.domain.valueobjects.ModeOfTransport;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;

import java.util.Date;

@Entity
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


    public Booking() {
    }
}
