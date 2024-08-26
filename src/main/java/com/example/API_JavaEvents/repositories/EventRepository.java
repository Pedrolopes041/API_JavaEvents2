package com.example.API_JavaEvents.repositories;


import com.example.API_JavaEvents.modals.EventModal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<EventModal, UUID> {
}
