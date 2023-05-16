package com.example.booking.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Destination implements ValueObject {

    private final String destinationCountry;
    private final String destinationCity;

    protected Destination() {
        this.destinationCity = "";
        this.destinationCountry = "";
    }
}
