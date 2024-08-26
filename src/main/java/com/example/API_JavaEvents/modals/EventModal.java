package com.example.API_JavaEvents.modals;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "Event")
public class EventModal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private int Vacancies;

    @Column
    private Date Start_date;

    @Column
    private Date End_date;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany
    @JoinTable(
            name = "Event_Guest",
            joinColumns = @JoinColumn(name = "User_id"),
            inverseJoinColumns = @JoinColumn(name = "Guest_id")
    )
    private Set<GuestModal> guests = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getVacancies() {
        return Vacancies;
    }

    public void setVacancies(int vacancies) {
        Vacancies = vacancies;
    }

    public Date getStart_date() {
        return Start_date;
    }

    public void setStart_date(Date start_date) {
        Start_date = start_date;
    }

    public Date getEnd_date() {
        return End_date;
    }

    public void setEnd_date(Date end_date) {
        End_date = end_date;
    }

    public Set<GuestModal> getGuests() {
        return guests;
    }

    public void setGuests(Set<GuestModal> guests) {
        this.guests = guests;
    }
}
