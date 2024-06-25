package com.example.Maize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private Long id;
    private String title;
    private String description;
    private String date;
    private String time;
    private int count_guest;
    private int price_ticket;
    private String eventType;
    private String option;
    private String ImageUrl;





    public EventDto(Long id,String title, String description, String eventType, String date, String time, int countGuest, int priceTicket, String imageUrl, String option) {
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
