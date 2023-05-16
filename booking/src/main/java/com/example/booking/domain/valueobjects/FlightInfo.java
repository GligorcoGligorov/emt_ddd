package com.example.booking.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class FlightInfo implements ValueObject {

    private final String airline;
    private final String flightNumber;

    public FlightInfo() {
        this.airline = "";
        this.flightNumber = "";
    }
}
