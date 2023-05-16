package com.example.booking.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Car implements ValueObject {

    private final String model;
    private final String manufacturer;
    private final int year;

    protected Car(){
        this.model = "";
        this.manufacturer = "";
        this.year = 2000;
    }

}
