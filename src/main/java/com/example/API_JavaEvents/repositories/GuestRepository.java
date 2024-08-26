package com.example.API_JavaEvents.repositories;

import com.example.API_JavaEvents.modals.GuestModal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuestRepository extends JpaRepository<GuestModal, UUID> {
}
