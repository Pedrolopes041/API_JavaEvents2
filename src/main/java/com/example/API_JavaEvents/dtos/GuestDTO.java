package com.example.API_JavaEvents.dtos;

import com.example.API_JavaEvents.modals.EventModal;

import java.util.Set;

public record GuestDTO(String Name, Set<EventModal> eventModals) {
}
