package com.example.booking.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class AddressLocation implements ValueObject {

    private final String addressLocation;

    protected AddressLocation() {
        this.addressLocation = "";
    }
}
