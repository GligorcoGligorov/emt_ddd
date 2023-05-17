package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.Destination;
import com.example.booking.domain.valueobjects.ModeOfTransport;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Itinerary extends AbstractEntity<ItineraryId> {

    private Destination destination;
    private Date dateOfTravel;
    @Enumerated(value = EnumType.STRING)
    private ModeOfTransport modeOfTransport;

    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "price_amount")),
            @AttributeOverride(name = "currency", column = @Column(name = "price_currency"))
    })

    private Money price;

    @ManyToMany
    List<Booking> bookingList;

    public Itinerary(Destination destination, Date dateOfTravel, ModeOfTransport modeOfTransport, Money price, List<Booking> bookingList) {
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.modeOfTransport = modeOfTransport;
        this.price = price;
        this.bookingList = bookingList;
    }
}
