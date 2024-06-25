package com.example.Maize.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title_event")
    private String title;
    @Column(name = "description_event")
    private String description;
    @Column(name = "date_event")
    private String date;
    @Column(name = "time_event")
    private String time;
    @Column(name = "count_guest_event")
    private int count_guest;
    @Column(name = "price_ticket_event")
    private int price_ticket;
    @Column(name = "eventType_event")
    private String eventType;
    @Column(name = "option_event")
    private String option;
    @Column(name = "image_url")
    private String ImageUrl;

    public Event(){

    }


    public Event(Long id,String title, String description, String eventType, String date, String time, int countGuest, int priceTicket, String imageUrl, String option) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.count_guest = countGuest;
        this.date = date;
        this.option = option;
        this.price_ticket = priceTicket;
        this.ImageUrl = imageUrl;
        this.time = time;
    }
}
