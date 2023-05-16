package com.example.booking.domain.models;

import com.example.booking.domain.valueobjects.AddressLocation;
import com.example.booking.domain.valueobjects.RoomType;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;

@Entity
public class Hotel  extends AbstractEntity<BookingId>{

    @Enumerated(value = EnumType.STRING)
    private RoomType roomType;
    private double hotelRating;
    private AddressLocation addressLocation;

}
