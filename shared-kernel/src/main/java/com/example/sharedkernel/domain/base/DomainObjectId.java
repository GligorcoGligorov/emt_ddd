package com.example.sharedkernel.domain.base;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.io.Serializable;

@MappedSuperclass
@Embeddable
@Getter
public class DomainObjectId implements Serializable {

    private String id;
}
