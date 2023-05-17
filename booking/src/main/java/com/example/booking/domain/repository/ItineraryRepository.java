package com.example.booking.domain.repository;

import com.example.booking.domain.models.Itinerary;
import com.example.booking.domain.models.ItineraryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, ItineraryId> {
    Optional<Itinerary> findById(long id);
}
