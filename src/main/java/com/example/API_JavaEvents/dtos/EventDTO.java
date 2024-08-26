package com.example.API_JavaEvents.dtos;

import com.example.API_JavaEvents.modals.GuestModal;

import java.util.Set;

public record EventDTO(String Name, int Vacancies, Long Start_date, Long End_date, Set<GuestModal> guests) {
}
