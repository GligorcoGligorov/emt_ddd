package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.Destination;
import com.example.booking.domain.valueobjects.ModeOfTransport;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;

import java.util.Date;

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

}
